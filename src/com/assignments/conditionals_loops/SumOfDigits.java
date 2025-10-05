package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Number should be positive");
                return;
            }
            int sum = 0;
            while (n != 0) {
                int d = n % 10;
                sum += d;
                n = n / 10;
            }
            System.out.println("Sum of digits = " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
