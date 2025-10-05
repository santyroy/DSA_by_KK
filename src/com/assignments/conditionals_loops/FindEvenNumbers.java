package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindEvenNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of days in the month");
            int days = sc.nextInt();
            if (days <= 0) {
                System.out.println("Days should be positive");
                return;
            }
            int count = 0;
            for (int i = 1; i <= days; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("No of days to go out = " + count);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
