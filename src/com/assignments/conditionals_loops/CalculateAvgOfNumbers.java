package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateAvgOfNumbers {
    public static void main(String[] args) {
        System.out.println("Average of N number. Press 0 to calculate avg.");
        try (Scanner sc = new Scanner(System.in)) {
            double n;
            double sum = 0;
            int count = 0;
            do {
                System.out.println("Enter a number");
                n = sc.nextDouble();
                sum += n;
                count++;
            } while (n != 0);
            if (count > 1) {
                double avg = (sum / (count - 1));
                System.out.printf("Avg of the numbers are: %.2f", avg);
            } else {
                System.out.println("No numbers entered");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
