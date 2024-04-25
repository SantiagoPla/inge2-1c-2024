#!./venv/bin/python
import unittest
from src.evaluate_condition import evaluate_condition


class TestEvaluateCondition(unittest.TestCase):
    def test_eq_with_different_ints(self):
        self.assertFalse(evaluate_condition(1, "Eq", 10, 20))

    def test_neq_with_different_ints(self):
        self.assertTrue(evaluate_condition(1, "Ne", 0, 1))

    def test_lt(self):
        self.assertTrue(evaluate_condition(1, "Lt", 0, 1))

    def test_ge(self):
        self.assertFalse(evaluate_condition(1, "Ge", 5, 10))

    def test_gt(self):
        self.assertTrue(evaluate_condition(1, "Gt", 10, 9))

    def test_le(self):
        self.assertTrue(evaluate_condition(1, "Le", 4, 4))

    def test_chars(self):
        self.assertTrue(evaluate_condition(1, "Gt", chr(4), chr(3)))
    
    def test_dict(self):
        chr_dict = {chr(1): 1, chr(4): 4, chr(8): 8}
        self.assertTrue(evaluate_condition(1, "In", chr(4), chr_dict))

    def test_empty_dict(self):
        chr_dict = {}
        self.assertFalse(evaluate_condition(1, "In", chr(99), chr_dict))