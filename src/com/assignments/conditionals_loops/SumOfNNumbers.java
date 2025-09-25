package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the n-th natural number to calculate sum");
            int n = sc.nextInt();
            if (n < 1) {
                System.out.println("N cannot be less than 1");
                return;
            }

            long loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }
            System.out.println("Loop Sum = " + loopSum);

            long formulaSum = (n * (n + 1L)) / 2;
            System.out.println("Formula Sum = " + formulaSum);

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
