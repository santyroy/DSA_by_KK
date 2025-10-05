package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            long n = sc.nextLong();
            if (n <= 0) {
                System.out.println("Number should be positive");
                return;
            }
            long sum = 0;
            for (long i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                    System.out.println(i);
                    // if a number (n) is divisible by (i) then,
                    // (n / i) factor should also divide (n)
                    long otherDivisors = n / i;
                    System.out.println(otherDivisors);
                    if (otherDivisors != 1 || otherDivisors != n) {
                        sum += otherDivisors;
                    }
                }
            }

            if (n == sum) {
                System.out.println(n + " is a perfect number");
            } else {
                System.out.println(n + " is not a perfect number");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
