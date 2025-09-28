package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Formula
 * Final Value (FV)
 * Monthly Investment (P)
 * Investment Years (N)
 * Rate of interest = (R)
 * FV = P * ((((1 + R) ^ N) - 1) / (R)) * (1 + R)
 */

public class SIPCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the fixed amount invested per month");
            double p = sc.nextDouble();
            if (p <= 0) {
                System.out.println("Monthly investment should be greater than 0");
                return;
            }
            System.out.println("Enter the annual interest rate");
            double r = sc.nextDouble();
            if (r < 0) {
                System.out.println("Annual interest rate cannot be negative");
                return;
            }
            System.out.println("Enter the investment duration in years");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Investment duration in years should be greater than 0");
                return;
            }
            // If interest rate = 0,
            // then FV = P * 12 * N
            double finalValue;
            if (r == 0) {
                finalValue = p * 12 * n;
            } else {
                r = r / 12 / 100; // calculate monthly interest rate
                n = n * 12; // total number of months
                finalValue = p * ((Math.pow((1 + r), n) - 1) / r) * (1 + r);
            }

            System.out.printf("Final Value = %.2f", finalValue);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
