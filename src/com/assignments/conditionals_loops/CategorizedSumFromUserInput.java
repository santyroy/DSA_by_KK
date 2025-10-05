package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CategorizedSumFromUserInput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter numbers, to stop enter 0");
            int n;
            int sumEven = 0;
            int sumOdd = 0;
            int sumNegative = 0;
            do {
                n = sc.nextInt();
                if (n < 0) {
                    sumNegative += n;
                } else if (n % 2 == 0) {
                    sumEven += n;
                } else {
                    sumOdd += n;
                }
            } while (n != 0);

            System.out.println("Sum of negative numbers: " + sumNegative);
            System.out.println("Sum of positive even numbers: " + sumEven);
            System.out.println("Sum of positive odd numbers: " + sumOdd);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
