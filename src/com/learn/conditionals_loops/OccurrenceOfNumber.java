package com.learn.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OccurrenceOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number:");
            long num = sc.nextLong();
            long temp = Math.abs(num);
            System.out.println("Enter the number to find it's occurrence:");
            long digit = sc.nextLong();
            if (digit < 0 || digit > 9) {
                System.out.println("Please enter a single digit");
                return;
            }
            int count = 0;
            while (temp != 0) {
                long d = temp % 10;
                if (d == digit) {
                    count++;
                }
                temp = temp / 10;
            }
            System.out.println("Count of " + digit + " in number: " + num + " is = " + count);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
