package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number");
            long a = sc.nextLong();
            System.out.println("Enter second number");
            long b = sc.nextLong();
            if (a <= 0 || b <= 0) {
                System.out.println("Input should be not be less than equal to zero");
                return;
            }
            long a1 = a;
            long b1 = b;

            // Find HCF, hcf = a when b = 0
            while (b != 0) {
                long remainder = a % b;
                a = b;
                b = remainder;
            }
            long hcf = a;
            // LCM = (a * b) / HCF --> this can cause overflow because of (a * b) multiplication first
            // This can be also written as (a / HCF) * b --> there overflow will be reduces because of division first
            System.out.println("LCM = " + (a1 / hcf) * b1);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
