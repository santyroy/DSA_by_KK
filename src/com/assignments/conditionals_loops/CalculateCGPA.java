package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the no.of subjects");
            int n = sc.nextInt();
            if (n <= 0 || n >= 1001) {
                System.out.println("No.of subject should be between 1 and 1000");
                return;
            }

            int weightedGradeSum = 0;
            int totalCreditHours = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("Enter grade and credit hours for each subject");
                int grade = sc.nextInt();
                int creditHours = sc.nextInt();
                if (grade < 0 || grade > 10 || creditHours <= 0) {
                    System.out.println("Invalid input. Please re-enter this subject");
                    i--; // so that the same iteration is re-executed
                    continue;
                }
                weightedGradeSum += grade * creditHours;
                totalCreditHours += creditHours;
            }
            double cgpa = 0;
            if (totalCreditHours > 0) {
                cgpa = weightedGradeSum / (double) totalCreditHours;
            }
            System.out.printf("Total CGPA: %.2f", cgpa);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
