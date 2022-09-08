package ru.sladkkov.leetcodetasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToInteger13Test {

    @Test
    void romanToInt() {
        assertEquals(1, RomanToInteger13.romanToInt("I"));
        assertEquals(2, RomanToInteger13.romanToInt("II"));
        assertEquals(3, RomanToInteger13.romanToInt("III"));
        assertEquals(4, RomanToInteger13.romanToInt("IV"));
        assertEquals(5, RomanToInteger13.romanToInt("V"));
        assertEquals(6, RomanToInteger13.romanToInt("VI"));
        assertEquals(9, RomanToInteger13.romanToInt("IX"));
        assertEquals(10, RomanToInteger13.romanToInt("X"));
        assertEquals(11, RomanToInteger13.romanToInt("XI"));
        assertEquals(100, RomanToInteger13.romanToInt("C"));
        assertEquals(1001, RomanToInteger13.romanToInt("MI"));
        assertEquals(1500, RomanToInteger13.romanToInt("MD"));
        assertEquals(523, RomanToInteger13.romanToInt("DXXIII"));
    }
}