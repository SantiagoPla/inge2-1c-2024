from typing import List, Set
from random import choice
from fuzzingbook.Coverage import Location
from fuzzingbook.MutationFuzzer import FunctionCoverageRunner
from src.mutation_utils import *
from src.roulette_input_selector import RouletteInputSelector
from src.get_source_lines import get_source_lines

class MagicFuzzer:
    def execute_input(self, inp):
        self.runner.run(inp)
        locations = self.runner.coverage()
        
        len_covered_before_input = len(self.covered_locations)
        if self.function_name_to_call is not None: 
            locations = [loc for loc in locations if loc[0] == self.function_name_to_call]
        self.covered_locations |= set(locations)

        if len_covered_before_input < len(self.covered_locations):
            self.contributing_inputs.append(inp)
            self.roulette.add_new_execution(inp, locations)
        
    def __init__(self, initial_inputs, function_to_call, function_name_to_call = None) -> None:
        """Ejecuta inputs iniciales, almacenando la cobertura obtenida"""
        self.covered_locations = set()
        self.contributing_inputs = []
        self.function_name_to_call = function_name_to_call
        self.function_to_call = function_to_call
        self.runner = FunctionCoverageRunner(function_to_call)
        self.roulette = RouletteInputSelector(2)
        for inp in initial_inputs:
            self.execute_input(inp)

    def get_contributing_inputs(self) -> List[str]:
        """Retorna la lista de los inputs que aumentaron la cobertura en el orden que fueron ejecutados"""
        return self.contributing_inputs

    def get_covered_locations(self) -> Set[Location]:
        """Retorna el conjunto de locaciones cubiertas de todas las ejecuciones"""
        return self.covered_locations

    def mutate(self, s: str) -> str:
        """Aplica al azar alguna de las tres operaciones de mutacion definidas en el archivo mutation_utils.py"""
        action = choice(['ADD', 'DEL', 'MOD'])
        if action == 'ADD':
            return insert_random_character(s)
        elif action == 'DEL':
            return delete_random_character(s)
        else: 
            return change_random_character(s)

    def fuzz(self):
        """
        Elije aleatoriamente un input s usando seleccion de ruleta sobre e(s),
        muta el input s utilizando la función mutate(s), y ejecuta el s mutado
        """
        chosen_input = self.roulette.select()
        mutated = self.mutate(chosen_input)
        self.execute_input(mutated)


    def run_until_covered(self) -> int:
        """
        Corre una campania del MagicFuzzer hasta cubrir todas las lineas del programa.
        Retorna la cantidad de iteraciones realizadas.
        """
        total_lines = get_source_lines(self.function_to_call) - 1
        it = 0
        while len(self.covered_locations) < total_lines:
            self.fuzz()
            #print(f">> Iteración {it} - {len(self.covered_locations)}/{total_lines}, {100*round(len(self.covered_locations)/total_lines, 2)}%" )
            #print(f"Cantidad de inputs contribuyentes: {len(self.contributing_inputs)}\n")
            it += 1

        print(self.contributing_inputs, self.covered_locations)
        print("\n\n\n")
        return it

    def run_iterations(self, n: int) -> None:
        """
        Corre una campaña del MagicFuzzer por n iteraciones.
        """
        it = 0
        while it < n:
            self.fuzz()
            #print(f">> Iteración {it} - {len(self.covered_locations)}/{total_lines}, {100*round(len(self.covered_locations)/total_lines, 2)}%" )
            #print(f"Cantidad de inputs contribuyentes: {len(self.contributing_inputs)}\n")
            it += 1

        print(self.contributing_inputs, self.covered_locations)
        print("\n\n\n")
        return it