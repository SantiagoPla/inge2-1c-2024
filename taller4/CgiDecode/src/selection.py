from random import choices, sample

def selection(fitness_by_individual, tournament_size):
    participants = sample(list(fitness_by_individual.items()), k = tournament_size)
    print(participants)
    winner = min(participants, key = lambda t: t[1])[0]
    return winner
