package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PowerInJava {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            double x = sc.nextDouble();
            System.out.println("Enter power of the number");
            int n = sc.nextInt();
            double result = 1;
            if (n == 0) {
                System.out.println("Result: 1");
                return;
            }
            if (x == 0) {
                System.out.println("Result: 0");
                return;
            }
            if (x == 1) {
                System.out.println("Result: 1");
                return;
            }
            if (x == -1) {
                if (n % 2 == 0) {
                    System.out.println("Result: 1");
                    return;
                } else {
                    System.out.println("Result: -1");
                    return;
                }
            }
            for (int i = 1; i <= Math.abs(n); i++) {
                result *= x;
            }

            if (n < 0) {
                System.out.println("Result: " + (1 / result));
            } else {
                System.out.println("Result: " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
