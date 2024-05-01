#!./venv/bin/python
import unittest
from random import seed
from src.mutation_utils import insert_random_character, delete_random_character, change_random_character
from scipy.spatial import distance


SEED = seed(912)


def differ_by_one(original, modified, action):
    k = {"ADD": 1, "DEL": -1, "MOD": 0}
    found = False
    res = True
    for i in range(min(len(original), len(modified))):
        if (found):
            res = res and original[i] == modified[i+k[action]]
        else: 
            found = original[i] != modified[i]
    return res


class TestMutationUtils(unittest.TestCase):
    def test_insert_random_character_increases_size_by_one(self):
        s = 'abc'
        res = insert_random_character(s)
        self.assertEqual(len(s) + 1, len(res))

    def test_insert_random_character_does_not_remove_characters(self):
        s = 'abc'
        res = insert_random_character(s)
        all_contained = all(c in res for c in s)
        self.assertTrue(all_contained)

    def test_insert_random_character_keeps_order(self):
        s = 'abcafqweffgq'
        modified = insert_random_character(s)
        self.assertTrue(differ_by_one(s, modified, 'ADD'))

    def test_insert_in_empty_string(self):
        s = ''
        modified = insert_random_character(s)
        self.assertTrue(1, len(modified))

    def test_delete_random_character_decreases_size_by_one(self):
        s = 'abc'
        res = delete_random_character(s)
        self.assertEqual(len(s) - 1, len(res))

    def test_delete_random_character_from_empty_string_returns_empty_string(self):
        s = ''
        res = delete_random_character(s)
        self.assertEqual(s, res)

    def test_delete_random_character_keeps_order(self):
        s = 'abcafqweffgq'
        modified = delete_random_character(s)
        self.assertTrue(differ_by_one(s, modified, 'DEL'))

    def test_change_random_character_keeps_length(self):
        s = 'asdfsdgsdgf'
        modified = change_random_character(s)
        self.assertEqual(len(s), len(modified))

    def test_change_random_character_from_empty_string_returns_empty_string(self):
        s = ''
        res = change_random_character(s)
        self.assertEqual(s, res)

    def test_change_random_character_keeps_order(self):
        s = 'abcafqweffgq'
        modified = change_random_character(s)
        self.assertTrue(differ_by_one(s, modified, 'MOD')) 