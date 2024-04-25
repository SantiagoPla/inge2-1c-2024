from random import choice, randint
from create_population import create_test_case, get_random_character

P = ['delete', 'add', 'modify']

def mutate(individual):
    mutated_individual = None
    action = choice(P)
    if (action == 'delete' and len(individual) > 1): 
        mutated_individual = individual.remove(choice(individual))
    elif (action == 'add' and len(individual) < 15): 
        mutated_individual = individual.append(create_test_case())
    elif (len(individual) > 0): 
        mod_action = choice(P)
        if (mod_action == 'delete' and len(individual) > 0):
            chosen = choice(individual)
            if (len(chosen) > 0):
                mutated_individual = individual.remove(chosen)
                cut = randint(1, len(chosen))
                #chosen = [0, 1, 2, 3]
                chosen = chosen[:cut-1] + chosen[cut:]

                mutated_individual = mutated_individual.append(chosen)
        elif (mod_action == 'add'):
            chosen = choice(individual)
            if (len(chosen) < 10):
                cut = randint(1, len(chosen))
                chosen = chosen[:cut] + get_random_character() + chosen[cut:]
                mutated_individual = individual.append(chosen)
        else: 
            chosen = choice(individual)
            if (len(chosen) > 0):
                cut = randint(1, len(chosen))
                chosen = chosen[:cut-1] + get_random_character() + chosen[cut:]
                mutated_individual = individual.append(chosen)

    return mutated_individual
