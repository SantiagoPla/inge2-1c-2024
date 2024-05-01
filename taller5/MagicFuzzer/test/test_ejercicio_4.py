#!./venv/bin/python
import unittest
from src.magic_fuzzer import MagicFuzzer
from src.crashme import crashme
from src.get_source_lines import get_source_lines
from random import seed

class TestEjercicio4(unittest.TestCase):

    def assertFuzzingCampaign(self, magic_fuzzer, len_contributing, iterations):
        real_iterations = magic_fuzzer.run_until_covered()
        real_contributing = len(magic_fuzzer.get_contributing_inputs())

        self.assertEqual(get_source_lines(self.function_to_call)-1, len(magic_fuzzer.get_covered_locations()))
        self.assertEqual(len_contributing, real_contributing)
        self.assertEqual(iterations, real_iterations)
    
    def setUp(self):
        self.function_to_call = crashme
        self.function_name_to_call = "crashme"

    def test_initial_input_is_exactly_contributing_input(self):
        seed(32)
        initial_inputs = {"bad!"}
        magic_fuzzer = MagicFuzzer(initial_inputs, self.function_to_call, self.function_name_to_call)
        self.assertFuzzingCampaign(magic_fuzzer, len_contributing=1, iterations=0)
    
    def test_initial_input_is_strictly_bigger_than_contributing_input(self):
        seed(45)
        initial_inputs = {"bad!", "good"}
        magic_fuzzer = MagicFuzzer(initial_inputs, self.function_to_call, self.function_name_to_call)
        self.assertFuzzingCampaign(magic_fuzzer, len_contributing=2, iterations=0)

    def test_empty_seed_1(self):
        seed(912)
        initial_inputs = {""}
        magic_fuzzer = MagicFuzzer(initial_inputs, self.function_to_call, self.function_name_to_call)
        self.assertFuzzingCampaign(magic_fuzzer, len_contributing=5, iterations=5169)

    def test_empty_seed_2(self):
        seed(3004)
        initial_inputs = {""}
        magic_fuzzer = MagicFuzzer(initial_inputs, self.function_to_call, self.function_name_to_call)
        self.assertFuzzingCampaign(magic_fuzzer, len_contributing=5, iterations=532)
        
    def test_empty_seed_3(self):
        seed(2654)
        initial_inputs = {""}
        magic_fuzzer = MagicFuzzer(initial_inputs, self.function_to_call, self.function_name_to_call)
        self.assertFuzzingCampaign(magic_fuzzer, len_contributing=5, iterations=4796)

    

    

