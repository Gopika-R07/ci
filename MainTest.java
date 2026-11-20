
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;


// ==================================================
// JUNIT TESTS - QUESTIONS 11 TO 14
// ==================================================

public class MainTest {

    // EXPERIMENT 11 - PALINDROME TESTS

    @Test
    void testPalindrome() {
        Main obj = new Main();
        assertTrue(obj.isPalindrome(121));
    }

    @Test
    void testNonPalindrome() {
        Main obj = new Main();
        assertFalse(obj.isPalindrome(123));
    }

    @Test
    void testSingleDigitPalindrome() {
        Main obj = new Main();
        assertTrue(obj.isPalindrome(7));
    }


    // EXPERIMENT 12 - PRIME NUMBER TESTS

    @Test
    void testPrimeNumber() {
        PrimeNumber obj = new PrimeNumber();
        assertTrue(obj.isPrime(7));
    }

    @Test
    void testNonPrimeNumber() {
        PrimeNumber obj = new PrimeNumber();
        assertFalse(obj.isPrime(10));
    }

    @Test
    void testOneIsNotPrime() {
        PrimeNumber obj = new PrimeNumber();
        assertFalse(obj.isPrime(1));
    }


    // EXPERIMENT 13 - FACTORIAL TESTS

    @Test
    void testFactorial() {
        Factorial obj = new Factorial();
        assertEquals(120, obj.calculateFactorial(5));
    }

    @Test
    void testZeroFactorial() {
        Factorial obj = new Factorial();
        assertEquals(1, obj.calculateFactorial(0));
    }

    @Test
    void testNegativeFactorial() {
        Factorial obj = new Factorial();

        assertThrows(
            IllegalArgumentException.class,
            () -> obj.calculateFactorial(-2)
        );
    }


    // EXPERIMENT 14 - FIBONACCI TESTS

    @Test
    void testFibonacciSeries() {
        FibonacciSeries obj = new FibonacciSeries();

        assertEquals(
            Arrays.asList(0, 1, 1, 2, 3),
            obj.getFibonacci(5)
        );
    }

    @Test
    void testSingleFibonacciTerm() {
        FibonacciSeries obj = new FibonacciSeries();

        assertEquals(
            Arrays.asList(0),
            obj.getFibonacci(1)
        );
    }

    @Test
    void testZeroFibonacciTerms() {
        FibonacciSeries obj = new FibonacciSeries();

        assertEquals(
            Arrays.asList(),
            obj.getFibonacci(0)
        );
    }
}
