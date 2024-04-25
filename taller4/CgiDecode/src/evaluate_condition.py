import sys
from typing import Dict

# Inicializar mappings globales
distances_true: Dict[int, int] = {}
distances_false: Dict[int, int] = {}


def update_maps(condition_num, d_true, d_false):
    global distances_true, distances_false

    if condition_num in distances_true.keys():
        distances_true[condition_num] = min(
            distances_true[condition_num], d_true)
    else:
        distances_true[condition_num] = d_true

    if condition_num in distances_false.keys():
        distances_false[condition_num] = min(
            distances_false[condition_num], d_false)
    else:
        distances_false[condition_num] = d_false


def clear_maps():
    global distances_true, distances_false
    distances_true.clear()
    distances_false.clear()


def get_true_distance(condition_num):
    global distances_true
    if condition_num in distances_true.keys():
        return distances_true[condition_num]
    else:
        return None


def get_false_distance(condition_num):
    global distances_false
    if condition_num in distances_false.keys():
        return distances_false[condition_num]
    else:
        return None


def has_reached_condition(condition_num):
    global distances_true, distances_false
    return condition_num in distances_true.keys() or condition_num in distances_false.keys()


def evaluate_condition(condition_num, op, lhs, rhs):
    K = 1
    if (type(rhs) is dict):
        assert(type(lhs) is str) 
        assert(op == 'In')
        if (len(rhs.keys()) == 0):
            d_true = sys.maxsize
            d_false = 0 
            update_maps(condition_num, d_true, d_false)
            return d_true == 0
        distance = lambda a, b : 0 if (abs(a - b) == 0) else abs(a - b)
        distances = [distance(ord(lhs), ord(k)) for k in rhs.keys()]
        d_true = min(distances)
        d_false = 1 if (d_true == 0) else 0
        update_maps(condition_num, d_true, d_false)
        return d_true == 0

    if (type(lhs) is str and type(rhs) is str):
        lhs = ord(lhs)
        rhs = ord(rhs)

    if (op == 'Eq'):
        d_true = 0 if (abs(lhs - rhs) == 0) else abs(lhs - rhs)
        d_false = 0 if (abs(lhs - rhs) != 0) else K
        update_maps(condition_num, d_true, d_false)
        return d_true == 0
    elif (op == 'Ne'):
        d_true = 0 if (abs(lhs - rhs) != 0) else K
        d_false = 0 if (abs(lhs - rhs) == 0) else abs(lhs - rhs)
        update_maps(condition_num, d_true, d_false)
        return d_true == 0
    elif (op == 'Lt'):
        d_true = 0 if (lhs < rhs) else (lhs - rhs + K)
        d_false = 0 if (lhs >= rhs) else rhs - lhs
        update_maps(condition_num, d_true, d_false)
        return d_true == 0
    elif (op == 'Ge'):
        d_true = 0 if (lhs >= rhs) else rhs - lhs
        d_false = 0 if (lhs < rhs) else (lhs - rhs + K)
        update_maps(condition_num, d_true, d_false)
        return d_true == 0
    elif (op == 'Gt'):
        d_true = 0 if (lhs > rhs) else (rhs - lhs + K)
        d_false = 0 if (lhs <= rhs) else lhs - rhs
        update_maps(condition_num, d_true, d_false)
        return d_true == 0
    elif (op == 'Le'):
        d_true = 0 if (lhs <= rhs) else lhs - rhs
        d_false = 0 if (lhs > rhs) else (rhs - lhs + K)
        update_maps(condition_num, d_true, d_false)
        return d_true == 0