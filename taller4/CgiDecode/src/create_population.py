from random import choice, randint
from string import printable


def get_random_character():
    return choice(printable)


def create_test_case():
    test_size = randint(0, 10)
    return str([get_random_character() for i in test_size])


def create_individual():
    test_suite_size = randint(1, 15)
    return [create_test_case() for i in test_suite_size]


def create_population(population_size):
    population = [create_individual() for i in range(population_size)]
    return population
