package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number to find it's factorial");
            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Input should be non-negative");
                return;
            }

            long factorial = 1;
            for (int i = 2; i <= n; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial is: " + factorial);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
