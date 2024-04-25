#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode


class TestCgiDecode(unittest.TestCase):
    def test_valid_plus(self):
        decoded = cgi_decode("1+1")
        self.assertEqual("1 1", decoded)

    def test_valid_percentage(self):
        decoded = cgi_decode("%11")      
        print("AAAAAAAAAAAAAAA", chr(17))  
        self.assertEqual(chr(17), decoded)
    
    def test_invalid_digit_high(self):
        with self.assertRaises(ValueError): 
            cgi_decode("%x1")

    def test_invalid_digit_low(self):
        with self.assertRaises(ValueError): 
            cgi_decode("%1x")
        

   