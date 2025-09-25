package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateCommissionPercentage {
    public static void main(String[] args) {
//        calculateCommissionPercent();
        calculateCommission();
    }

    public static void calculateCommissionPercent() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter total sales");
            double totalSales = sc.nextDouble();
            System.out.println("Enter commission earned");
            double commission = sc.nextDouble();
            if (totalSales <= 0) {
                throw new InputMismatchException();
            }
            double commissionPercent = (commission / totalSales) * 100;
            System.out.printf("Commission Percent = %.2f", commissionPercent);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }


    /**
     * 5% for first ₹10,000
     * 10% for next ₹10,000
     * 15% for anything beyond ₹20,000
     */

    public static void calculateCommission() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter total sales");
            double totalSales = sc.nextDouble();
            if (totalSales <= 0) {
                throw new InputMismatchException();
            }

            double commission = 0.0;
            if (totalSales > 20000) {
                commission += ((totalSales - 20000) * 15) / 100;
                totalSales = 20000;
            }
            if (totalSales > 10000) {
                commission += ((totalSales - 10000) * 10) / 100;
                totalSales = 10000;
            }
            commission += (totalSales * 5) / 100;

            System.out.printf("Commission = %.2f", commission);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
