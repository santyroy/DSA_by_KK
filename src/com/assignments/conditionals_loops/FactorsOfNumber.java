package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter an integer:");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Number should greater than 0");
                return;
            }

            System.out.println("Factors of number: " + n);
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
