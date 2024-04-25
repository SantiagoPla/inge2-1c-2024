from random import randint

def crossover(parent1, parent2):
    cut1 = randint(0, len(parent1) - 1)
    cut2 = randint(0, len(parent2) - 1)
    print(cut1, cut2)

    offspring1 = parent1[:cut1] + parent2[cut2:]
    offspring2 = parent2[:cut2] + parent1[cut1:]

    return offspring1, offspring2


