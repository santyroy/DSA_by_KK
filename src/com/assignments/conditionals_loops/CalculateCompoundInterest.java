package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateCompoundInterest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the principal");
            double p = sc.nextDouble();
            if (p <= 0) {
                System.out.println("Principal cannot be 0 or negative");
                return;
            }
            System.out.println("Enter the rate %");
            double r = sc.nextDouble();
            if (r <= 0 || r > 100) {
                System.out.println("Rate should be in-between 0 and 101");
                return;
            }
            System.out.println("Enter the compounding frequency 1 for yearly or 4 for quarterly");
            int n = sc.nextInt();
            if (n == 1 || n == 4) {
                System.out.println("Enter the time in years");
                int t = sc.nextInt();
                if (t <= 0 || t > 100) {
                    System.out.println("Time should be in-between 0 and 101");
                    return;
                }
                double a = p * Math.pow((1 + (r / 100 / n)), (n * t));
                System.out.printf("Compound Interest = %.2f", a - p);
            } else {
                System.out.println("Compounding frequency should be either 1 or 4");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
