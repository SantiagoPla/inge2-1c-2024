#!./venv/bin/python
import unittest
from random import seed
from src.magic_fuzzer import MagicFuzzer
from src.my_parser import my_parser


class TestEjercicio5(unittest.TestCase):
    def assertFuzzingCampaign(self, magic_fuzzer, len_contributing, iterations, len_covered):
        real_iterations = magic_fuzzer.run_iterations(5000)
        real_contributing = len(magic_fuzzer.get_contributing_inputs())
        real_covered = len(magic_fuzzer.get_covered_locations())

        #print(real_contributing, real_iterations, real_covered)
        self.assertEqual(len_covered, real_covered)
        self.assertEqual(len_contributing, real_contributing)
        self.assertEqual(iterations, real_iterations)
    
    def setUp(self):
        self.function_to_call = my_parser
        self.function_name_to_call = None

    def test_empty_seed_1(self):
        seed(912)
        initial_inputs = {""}
        magic_fuzzer = MagicFuzzer(initial_inputs, self.function_to_call, self.function_name_to_call)
        self.assertFuzzingCampaign(magic_fuzzer, len_contributing=23, iterations=5000, len_covered=466)

    def test_empty_seed_2(self):
        seed(3004)
        initial_inputs = {""}
        magic_fuzzer = MagicFuzzer(initial_inputs, self.function_to_call, self.function_name_to_call)
        self.assertFuzzingCampaign(magic_fuzzer, len_contributing=17, iterations=5000, len_covered=161)
        
    def test_empty_seed_3(self):
        seed(2654)
        initial_inputs = {""}
        magic_fuzzer = MagicFuzzer(initial_inputs, self.function_to_call, self.function_name_to_call)
        self.assertFuzzingCampaign(magic_fuzzer, len_contributing=25, iterations=5000, len_covered=198)

    