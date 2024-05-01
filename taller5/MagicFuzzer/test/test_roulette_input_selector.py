#!./venv/bin/python
import unittest
from src.roulette_input_selector import RouletteInputSelector


class TestRouletteInputSelector(unittest.TestCase):

    def test(self):
        selector = RouletteInputSelector(2)

        selector.add_new_execution("good", {("crashme", 2)})
        selector.add_new_execution("goo", {("crashme", 2)})
        selector.add_new_execution("go", {("crashme", 2)})
        selector.add_new_execution("b", {("crashme", 2), ("crashme", 3)})
        selector.add_new_execution("bx", {("crashme", 2), ("crashme", 3)})
        selector.add_new_execution("by", {("crashme", 2), ("crashme", 3)})
        selector.add_new_execution("bad", {("crashme", 2), ("crashme", 3), ("crashme", 4), ("crashme", 5)})

        self.assertEqual(selector.get_frequency("good"), 3)
        self.assertEqual(selector.get_frequency("goo"), 3)
        self.assertEqual(selector.get_frequency("go"), 3)
        self.assertEqual(selector.get_frequency("b"), 3)
        self.assertEqual(selector.get_frequency("bx"), 3)
        self.assertEqual(selector.get_frequency("by"), 3)
        self.assertEqual(selector.get_frequency("bad"), 1)

        self.assertAlmostEqual(selector.get_energy("good"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("goo"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("go"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("b"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("bx"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("by"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("bad"), 1/(1**2), places=2)
    
    def test_all_inputs_have_same_energy(self):
        selector = RouletteInputSelector(2)

        selector.add_new_execution("a", {("my_function", 2)})
        selector.add_new_execution("ab", {("my_function", 2)})
        selector.add_new_execution("abc", {("my_function", 2)})
        selector.add_new_execution("b", {("my_function", 2), ("my_function", 3)})
        selector.add_new_execution("bc", {("my_function", 2), ("my_function", 3)})
        selector.add_new_execution("bd", {("my_function", 2), ("my_function", 3)})
        selector.add_new_execution("c", {("my_function", 2), ("my_function", 3), ("my_function", 4)})
        selector.add_new_execution("cd", {("my_function", 2), ("my_function", 3), ("my_function", 4)})
        selector.add_new_execution("ce", {("my_function", 2), ("my_function", 3), ("my_function", 4)})

        self.assertEqual(selector.get_frequency("a"), 3)
        self.assertEqual(selector.get_frequency("ab"), 3)
        self.assertEqual(selector.get_frequency("abc"), 3)
        self.assertEqual(selector.get_frequency("b"), 3)
        self.assertEqual(selector.get_frequency("bc"), 3)
        self.assertEqual(selector.get_frequency("bd"), 3)
        self.assertEqual(selector.get_frequency("c"), 3)
        self.assertEqual(selector.get_frequency("cd"), 3)
        self.assertEqual(selector.get_frequency("ce"), 3)

        self.assertAlmostEqual(selector.get_energy("a"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("ab"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("abc"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("b"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("bc"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("bd"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("c"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("cd"), 1/(3**2), places=2)
        self.assertAlmostEqual(selector.get_energy("ce"), 1/(3**2), places=2)

    def test_one_input(self):
        selector = RouletteInputSelector(2)

        selector.add_new_execution("a", {("my_function", 2)})

        self.assertEqual(selector.get_frequency("a"), 1)

        self.assertAlmostEqual(selector.get_energy("a"), 1, places=2)

