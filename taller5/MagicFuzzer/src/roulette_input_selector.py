from typing import Set
from random import uniform
from fuzzingbook.Coverage import Location
from fuzzingbook.GreyboxFuzzer import getPathID

class RouletteInputSelector:

    def __init__(self, exponent: int):
        """Guarda el exponente"""
        assert(exponent > 0)
        self.exponent = exponent
        self.frequencies = {}
        self.paths = {}

    def add_new_execution(self, s: str, s_path: Set[Location]):
        """Agrega una nueva ejecución del input s y su path"""
        path_hash = getPathID(s_path)
        self.paths[s] = path_hash
        if path_hash not in self.frequencies:
            self.frequencies[path_hash] = 1 
        else: 
            self.frequencies[path_hash] += 1
        

    def get_frequency(self, s: str) -> int:
        """Retorna la cantidad de apariciones del path_id de s. Retorna 0 si el input no fue ejecutado"""
        if s not in self.paths:
            return 0
        return self.frequencies[self.paths[s]]

    def get_energy(self, s: str) -> float:
        """Retorna el valor actual de e(s). Levanta una excepción si el input no fue ejecutado"""
        try:
            return 1/self.get_frequency(s)**self.exponent
        except Exception:
            print(f"El input {s} no ha sido ejecutado.")
            
    def select(self) -> str:
        """Elije aleatoriamente un s usando seleccion de ruleta sobre e(s)"""
        total_energy = sum([self.get_energy(s) for s in self.paths.keys()])
        input_by_interval = {}
        last_upper_bound = 0
       
        for s in self.paths.keys():
            proportion = self.get_energy(s) / total_energy
            upper_bound = round(last_upper_bound + proportion, 4)
            input_by_interval[(last_upper_bound, upper_bound)] = s
            last_upper_bound = upper_bound
        """
        last_key = None
        for k_t in input_by_interval: 
            if k_t[1] == last_upper_bound:
                last_key = k_t 
        """
        last_key = list(input_by_interval.keys())[-1]

        input_by_interval[(last_key[0], 1)] = input_by_interval.pop(last_key)

        r = uniform(0, 1)
        for l, u in input_by_interval.keys():
            if r >= l and (r < u or r == 1):
                return s 

        raise Exception("No encontró intervalo.")
