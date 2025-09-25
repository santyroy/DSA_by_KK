package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateAverageMarks {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter no. of subjects");
            int n = sc.nextInt();
            if (n < 1 || n > 100) {
                System.out.println("No. of subjects should be in-between 1 and 100");
                return;
            }


            int totalMarks = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("Enter marks for subject - " + i + 1);
                int marks = sc.nextInt();
                if (marks < 0 || marks > 100) {
                    System.out.println("Marks should be in-between 0 and 100. Please re-enter.");
                    i--;
                    continue;
                }
                totalMarks += marks;
            }
            System.out.printf("Avg marks: %.2f", ((double) totalMarks / n));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
