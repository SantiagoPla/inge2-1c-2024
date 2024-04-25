#!./venv/bin/python
import unittest
from src.get_fitness_cgi_decode import get_fitness_cgi_decode, normalize
from src.evaluate_condition import clear_maps

PRECISION = 6

class TestGetFitnessCgiDecode(unittest.TestCase):
    def normalized_ord(self, a, b):
        return normalize(abs(ord(a) - ord(b)))
    
    def assertEqualRounded(self, x, y):
        self.assertEqual(round(x, PRECISION), round(y, PRECISION))
                         
    def test_same_two_valid_hex_values(self):
        clear_maps()
        expected = self.normalized_ord('%', '+') + 3 * normalize(1) 
        
        self.assertEqualRounded(expected, get_fitness_cgi_decode(["%AA"]))
        #NO SE CUMPLEN: 
        #C2 TRUE -> dist = abs(ord('%') - ord('+'))
        #C3 FALSE -> dist = 1
        #C4 FALSE -> dist = 1
        #C5 FALSE -> dist = 1

    def test_two_different_hex_values(self):
        clear_maps()
        expected = normalize(3) + self.normalized_ord('%', '+') + 2 * normalize(1) + self.normalized_ord('U', 'a')
        self.assertEqualRounded(expected, get_fitness_cgi_decode(["%AU"]))
        #NO SE CUMPLEN: 
        #C1 FALSE -> dist = 3
        #C2 TRUE -> dist = abs(ord('%') - ord('+'))
        #C3 FALSE -> dist = 1
        #C4 FALSE -> dist = 1
        #C5 TRUE -> dist = abs(ord('A') - ord('U'))

    def test_two_invalid_hex_values(self):
        clear_maps()
        expected = normalize(3) + normalize(1) + self.normalized_ord('U', 'a') + self.normalized_ord('%', '+') + 2 
        self.assertEqualRounded(expected, get_fitness_cgi_decode(["%UU"]))
        #NO SE CUMPLEN: 
        #C1 FALSE -> dist = 3
        #C2 TRUE -> dist = abs(ord('%') - ord('+'))
        #C3 FALSE -> dist = 1
        #C4 TRUE -> dist = abs(ord('A') - ord('U'))
        #C5 no llega a cubrirse --> suma 2

    def test_empty_string(self):
        clear_maps()
        expected = 8 + normalize(1)
        self.assertEqualRounded(expected, get_fitness_cgi_decode([""]))
        #NO SE CUMPLEN: 
        #C1 TRUE -> dist = 1
        #C2 no se cubre -> suma 2
        #C3 no se cubre -> suma 2
        #C4 no se cubre -> suma 2
        #C5 no se cubre -> suma 2

    def test_percentage(self):
        clear_maps()
        expected = normalize(1) + self.normalized_ord('%', '+') + normalize(1) + 4
        self.assertEqualRounded(expected, get_fitness_cgi_decode(["%"]))
        #NO SE CUMPLEN: 
        #C1 FALSE -> dist = 1
        #C2 TRUE -> dist = abs(ord('%') - ord('+'))
        #C3 FALSE -> dist = 1
        #C4 no s ecubre
        #C5 idem

    def test_low_digit_missing(self):
        clear_maps()
        expected = normalize(2) + self.normalized_ord('%', '+') + normalize(1) + 4
        self.assertEqualRounded(expected, get_fitness_cgi_decode(["%1"]))
        #NO SE CUMPLEN: 
        #C1 FALSE -> dist = 2
        #C2 TRUE -> dist = abs(ord('%') - ord('+'))
        #C3 FALSE -> dist = 1
        #C4 no s ecubre
        #C5 idem

    def test_plus(self):
        clear_maps()
        expected = normalize(1) + 6
        self.assertEqualRounded(expected, get_fitness_cgi_decode(["+"]))
        #Se cumple C1_T
        #Como también se cumple C2_T, no pasa por C3, C4, C5. Luego cubre C1_F

    def test_plus_and_low_digit_missing(self):
        clear_maps()
        expected = normalize(2) + normalize(1) + 4
        self.assertEqualRounded(expected, get_fitness_cgi_decode(["+%1"]))
        #Con el + se cumple C1_T y C2_T. 
        #Sigue %1. Se cumple C2_F y C3_T. Después pincha con el s[i+2].
        #C1 FALSE -> dist = len(s) - i (con i = 1) = 2!!!!!
        #C3 FALSE -> dist = 1
        #C4 no se cubre
        #C5 idem

    def test_invalid_low_digit(self):
        clear_maps()
        expected = normalize(3) + self.normalized_ord('%', '+') + 2 * normalize(1) + self.normalized_ord('+', '0')
        self.assertEqualRounded(expected, get_fitness_cgi_decode(["%1+"]))
        #NO SE CUMPLEN: 
        #C1 FALSE -> dist = len(s) - i (con i = 0) = 3
        #C2 TRUE -> normalized ord % +
        #C3 FALSE -> dist = 1
        #C4 FALSE -> dist = 1
        #C5 TRUE -> 

    def test_no_percentage(self):
        clear_maps()
        expected = self.normalized_ord('H', '%') + 4
        self.assertEqualRounded(expected, get_fitness_cgi_decode(["Hello+Reader"]))
        #C3 TRUE -> dist = normalized ord % + 
        #C4 y C5 nunca se cubren

    def test_multiple_test_cases(self):
        clear_maps()
        expected = 0
        self.assertEqualRounded(expected, get_fitness_cgi_decode(["", "+", "%12", "%1x", "%x1", "c"]))