package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RetirementGoalPlanner {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter goal amount");
            double goalAmount = sc.nextDouble();

            System.out.println("Enter current savings");
            double currentSavings = sc.nextDouble();

            if (goalAmount < currentSavings) {
                System.out.println("Goal amount should be higher than current savings");
                return;
            }

            System.out.println("Enter monthly contribution");
            double monthlyContrib = sc.nextDouble();

            System.out.println("Enter annual rate of interest");
            double rate = sc.nextDouble();

            if (monthlyContrib == 0 && rate == 0) {
                System.out.println("Goal is unreachable with zero contribution and zero interest.");
                return;
            }

            int noOfMonths = 0;

            while (currentSavings <= goalAmount) {
                double interest = currentSavings * (rate / 12 / 100);
                currentSavings += interest + monthlyContrib;
                noOfMonths++;
            }

            System.out.println("Total time in months = " + noOfMonths + " or " + (noOfMonths / 12) + " yrs");

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
