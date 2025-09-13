package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfAllUserInputNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Press 0 to exit program and print sum");
            int sum = 0;
            int n;
            do {
                System.out.println("Enter an integer:");
                n = sc.nextInt();
                sum = sum + n;
            } while (n != 0);
            System.out.printf("Sum: %d", sum);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
