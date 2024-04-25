#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode
from src.cgi_decode_instrumented import cgi_decode_instrumented
from src.evaluate_condition import clear_maps, get_true_distance, get_false_distance


class TestEvaluateConditionForCgiDecodeInstrumented(unittest.TestCase):
    def test_decoding_result_without_digits(self):
        clear_maps()
        decoded = cgi_decode_instrumented('Hello+World')
        self.assertEqual('Hello World', decoded)

    def test_decoding_result_with_digits(self):
        clear_maps()
        decoded = cgi_decode_instrumented('Hello+%01')
        self.assertEqual('Hello ' + chr(1), decoded)


    def test_true_distance_without_digits(self):
        clear_maps()
        decoded = cgi_decode_instrumented('abc')
        self.assertEqual('abc', decoded)
        self.assertEqual(0, get_true_distance(1))
        self.assertEqual(abs(ord('a') - ord('+')), get_true_distance(2))
        self.assertEqual(abs(ord('a') - ord('%')), get_true_distance(3))

    def test_false_distance_without_digits(self):
        clear_maps()
        decoded = cgi_decode_instrumented('abc')
        self.assertEqual('abc', decoded)
        self.assertEqual(0, get_false_distance(1))
        self.assertEqual(0, get_false_distance(2))
        self.assertEqual(0, get_false_distance(3))

    def test_true_distance_with_valid_digits(self):
        clear_maps()
        decoded = cgi_decode_instrumented('%01')
        self.assertEqual(chr(1), decoded)
        self.assertEqual(0, get_true_distance(1))
        self.assertEqual(abs(ord('+') - ord('%')), get_true_distance(2))
        self.assertEqual(0, get_true_distance(3))
        self.assertEqual(0, get_true_distance(4))
        self.assertEqual(0, get_true_distance(5))

    def test_false_distance_with_valid_digits(self):
        clear_maps()
        decoded = cgi_decode_instrumented('%01')
        self.assertEqual(chr(1), decoded)
        self.assertEqual(0, get_false_distance(1))
        self.assertEqual(0, get_false_distance(2))
        self.assertEqual(1, get_false_distance(3)) #K = 1. ¿Mejor no usar K en evaluate_condition?
        self.assertEqual(1, get_false_distance(4))
        self.assertEqual(1, get_false_distance(5))

    def test_true_distance_with_invalid_high_digit(self):
        clear_maps()
        with self.assertRaises(ValueError): 
            cgi_decode_instrumented("%x1")
        self.assertEqual(0, get_true_distance(1))
        self.assertEqual(abs(ord('+') - ord('%')), get_true_distance(2))
        self.assertEqual(0, get_true_distance(3)) 
        self.assertEqual(abs(ord('x') - ord('f')), get_true_distance(4))

    def test_false_distance_with_invalid_high_digit(self):
        clear_maps()
        with self.assertRaises(ValueError): 
            cgi_decode_instrumented("%x1")
        self.assertEqual(3, get_false_distance(1))
        self.assertEqual(0, get_false_distance(2))
        self.assertEqual(1, get_false_distance(3)) 
        self.assertEqual(0, get_false_distance(4))

    def test_true_distance_with_invalid_low_digit(self):
        clear_maps()
        with self.assertRaises(ValueError): 
            cgi_decode_instrumented("%1x")
        self.assertEqual(0, get_true_distance(1))
        self.assertEqual(abs(ord('+') - ord('%')), get_true_distance(2))
        self.assertEqual(0, get_true_distance(3)) 
        self.assertEqual(0, get_true_distance(4))
        self.assertEqual(abs(ord('x') - ord('f')), get_true_distance(5))

    def test_false_distance_with_invalid_low_digit(self):
        clear_maps()
        with self.assertRaises(ValueError): 
            cgi_decode_instrumented("%1x")
        self.assertEqual(3, get_false_distance(1))
        self.assertEqual(0, get_false_distance(2))
        self.assertEqual(1, get_false_distance(3)) 
        self.assertEqual(1, get_false_distance(4))
        self.assertEqual(0, get_false_distance(5))
        
        
           

