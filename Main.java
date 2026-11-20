
package org.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// ==================================================
// EXPERIMENT 11 - PALINDROME NUMBER
// ==================================================

public class Main {

    public boolean isPalindrome(int number) {

        if (number < 0) {
            return false;
        }

        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Main obj = new Main();

        if (obj.isPalindrome(number)) {
            System.out.println(number + " is a Palindrome");
        } else {
            System.out.println(number + " is not a Palindrome");
        }
    }
}


// ==================================================
// EXPERIMENT 12 - PRIME NUMBER
// ==================================================

class PrimeNumber {

    public boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        PrimeNumber obj = new PrimeNumber();

        if (obj.isPrime(number)) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }
    }
}


// ==================================================
// EXPERIMENT 13 - FACTORIAL USING LOOP
// ==================================================

class Factorial {

    public long calculateFactorial(int number) {

        if (number < 0) {
            throw new IllegalArgumentException(
                "Negative numbers are not allowed"
            );
        }

        long fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Factorial obj = new Factorial();

        System.out.println(
            "Factorial = " + obj.calculateFactorial(number)
        );
    }
}


// ==================================================
// EXPERIMENT 14 - FIBONACCI SERIES
// ==================================================

class FibonacciSeries {

    public List<Integer> getFibonacci(int n) {

        List<Integer> series = new ArrayList<>();

        int first = 0;
        int second = 1;

        for (int i = 0; i < n; i++) {

            series.add(first);

            int next = first + second;
            first = second;
            second = next;
        }

        return series;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        FibonacciSeries obj = new FibonacciSeries();

        System.out.println(obj.getFibonacci(n));
    }
}
