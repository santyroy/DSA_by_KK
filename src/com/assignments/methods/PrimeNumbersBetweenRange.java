package com.assignments.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumbersBetweenRange {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number:");
            int num1 = sc.nextInt();
            System.out.println("Enter second number:");
            int num2 = sc.nextInt();
            if (num1 <= 0 || num2 <= 0) {
                System.out.println("Both Numbers should be positive");
                return;
            }
            if (num1 == 1 || num2 == 1) {
                System.out.println("1 is neither prime nor composite");
                return;
            }
            if (num1 > num2) {
                System.out.println("Num1 should be less than Num2");
                return;
            }
            System.out.println("Prime numbers between " + num1 + " and " + num2);
            for (int i = num1; i <= num2; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
