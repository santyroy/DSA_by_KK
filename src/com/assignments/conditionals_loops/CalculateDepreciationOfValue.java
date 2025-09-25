package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateDepreciationOfValue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the initial value of the asset");
            double initialValue = sc.nextDouble();
            if (initialValue <= 0) {
                System.out.println("Invalid Initial Value");
            }
            System.out.println("Enter the depreciation rate of the asset");
            double depreciationRate = sc.nextDouble();
            if (depreciationRate < 1 || depreciationRate > 100) {
                System.out.println("Invalid Rate");
                return;
            }
            System.out.println("Enter the number of years");
            int years = sc.nextInt();
            if (years < 1) {
                System.out.println("Invalid Year");
                return;
            }
            System.out.println("Enter depreciation method 'SL' or 'RB'");
            String method = sc.next();

            if (method.equalsIgnoreCase("SL")) {
                // Straight line method
                double depreciationAmount = (depreciationRate / 100) * initialValue;
                double totalDepreciationAmount = depreciationAmount * years;
                initialValue -= totalDepreciationAmount;
                if (initialValue <= 0) {
                    initialValue = 0;
                }
            } else if (method.equalsIgnoreCase("RB")) {
                // Method 1 - Reducing Balance method via loop - O(n)
//                for (int i = 1; i <= years; i++) {
//                    double depreciationAmount = (depreciationRate / 100) * initialValue;
//                    initialValue -= depreciationAmount;
//                }
                // Method 2 - Reducing Balance method via formula - O(1)
                initialValue = initialValue * Math.pow((1 - (depreciationRate / 100)), years);
            } else {
                System.out.println("Invalid Method");
                return;
            }

            System.out.printf("Final Value of the asset = %.2f", initialValue);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
