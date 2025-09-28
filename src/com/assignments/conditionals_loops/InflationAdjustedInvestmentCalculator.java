package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
    Nominal Future Value (FV) Without adjusting for inflation:
    FV = P × (1+r)^t
    Real Future Value (Inflation Adjusted) Adjusted for inflation:
    RealFV = FV ÷ (1+i)^t
 */

public class InflationAdjustedInvestmentCalculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter principal amount");
            double p = sc.nextDouble();
            if (p < 0) {
                System.out.println("Principal cannot be negative");
                return;
            }
            System.out.println("Enter annual rate of interest");
            double r = sc.nextDouble();
            if (r < 0) {
                System.out.println("Rate cannot be negative");
                return;
            }
            System.out.println("Enter inflation rate");
            double i = sc.nextDouble();
            if (i < 0) {
                System.out.println("Inflation cannot be negative");
                return;
            }
            System.out.println("Enter years of investment");
            int t = sc.nextInt();
            if (t < 0) {
                System.out.println("Time cannot be negative");
                return;
            }

            double nominalFutureValue = p * Math.pow(1 + r / 100, t);
            System.out.printf("Nominal Future Value: %.2f%n", nominalFutureValue);

            double realFutureValue = nominalFutureValue / Math.pow(1 + i / 100, t);
            System.out.printf("Real Future Value: %.2f%n", realFutureValue);

            double lossDueToInflation = nominalFutureValue - realFutureValue;
            System.out.printf("Loss in purchasing power: %.2f%n", lossDueToInflation);

            double inflationImpact = (lossDueToInflation / nominalFutureValue) * 100;
            System.out.printf("Inflation eroded %.2f%% of your returns.%n", inflationImpact);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
