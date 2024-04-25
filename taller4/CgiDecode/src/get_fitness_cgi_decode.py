from src.cgi_decode_instrumented import cgi_decode_instrumented
from src.evaluate_condition import clear_maps, get_true_distance, get_false_distance

def normalize(x):
    return x / (x+1)

def get_fitness_cgi_decode(test_suite):
    fitness = 0
    #hay que computar el fitness para una lista de casos de test usando cgi_decode_instrumented. 
    #Recuerdo: cgi_decode_instrumented deja en true_Dis
    for test_case in test_suite:
        try:
            cgi_decode_instrumented(test_case)
        except Exception as e:
            pass

    for condition_num in range(1,6):
        true_distance = get_true_distance(condition_num)
        fitness += 1 if (true_distance == None) else normalize(true_distance)

        false_distance = get_false_distance(condition_num)
        fitness += 1 if (false_distance == None) else normalize(false_distance)
    
    return fitness


    