package ru.sladkkov.leetcodetasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumber9Test {

    @Test
    void firstSolution() {
        assertTrue(PalindromeNumber9.firstSolution(121));
        assertTrue(PalindromeNumber9.firstSolution(111));
        assertFalse(PalindromeNumber9.firstSolution(1231));
        assertTrue(PalindromeNumber9.firstSolution(0));
        assertFalse(PalindromeNumber9.firstSolution(-5));
    }

    @Test
    void secondSolution() {
        assertTrue(PalindromeNumber9.secondSolution(121));
        assertTrue(PalindromeNumber9.secondSolution(111));
        assertFalse(PalindromeNumber9.secondSolution(1231));
        assertTrue(PalindromeNumber9.secondSolution(0));
        assertFalse(PalindromeNumber9.secondSolution(-5));
    }

    @Test
    void thirdSolution() {
        assertTrue(PalindromeNumber9.thirdSolution(121));
        assertTrue(PalindromeNumber9.thirdSolution(111));
        assertFalse(PalindromeNumber9.thirdSolution(1231));
        assertTrue(PalindromeNumber9.thirdSolution(0));
        assertFalse(PalindromeNumber9.thirdSolution(-5));
    }

    @Test
    void fouthSolution() {
        assertTrue(PalindromeNumber9.forthSolution(121));
        assertTrue(PalindromeNumber9.forthSolution(111));
        assertFalse(PalindromeNumber9.forthSolution(1231));
        assertTrue(PalindromeNumber9.forthSolution(0));
        assertFalse(PalindromeNumber9.forthSolution(-5));
    }
}