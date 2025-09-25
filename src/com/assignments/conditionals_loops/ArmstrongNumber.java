package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number to check if Armstrong or not");
            int n = sc.nextInt();
            if(n < 1) {
                System.out.println("Number should be greater than 0");
                return;
            }
            long temp = n;
            int pow = 0;
            while (temp != 0) {
                pow++;
                temp = temp / 10;
            }
            temp = n;
            long sum = 0;
            while (temp != 0) {
                long digit = temp % 10;
                sum = sum + (long) Math.pow(digit, pow);
                temp = temp / 10;
            }
            if (n == sum) {
                System.out.println("Armstrong number");
            } else {
                System.out.println("Not an Armstrong number");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
