from src.get_fitness_cgi_decode import get_fitness_cgi_decode

def evaluate_population(population):
    fitness = {}
    for i in range(len(population)):
        fitness[i] = get_fitness_cgi_decode(population[i])
    return fitness
