from random import randint, choice
from string import printable


def insert_random_character(s: str) -> str:
    """Retorna s con un caracter random insertado en una posicion al azar"""
    index = randint(0, len(s))
    c = choice(printable)
    return s[:index] + c + s[index:]
     


def delete_random_character(s: str) -> str:
    """Retorna s con un caracter random eliminado.
    Si la cadena esta vacia, no la modifica"""
    if len(s) == 0:
        return s
    index = randint(0, len(s)-1)
    return s[:index] + s[index + 1:]


def change_random_character(s: str) -> str:
    """Retorna s con un caracter modificado en una posicion al azar.
    El caracter a modificar es reemplazado por otro caracter random.
    Si la cadena esta vacia, no la modifica."""
    if len(s) == 0:
        return s
    index = randint(0, len(s)-1)
    c = choice(printable)
    return s[:index] + c + s[index+1:]


