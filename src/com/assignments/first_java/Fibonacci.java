package com.assignments.first_java;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the length of Fibonacci series");
            long n = sc.nextLong();
            long num1 = 0;
            long num2 = 1;
            if (n <= 0) {
                System.out.println("Please enter positive number");
            } else if (n == 1) {
                System.out.println("Fibonacci Series: " + num1);
            } else if (n == 2) {
                System.out.println("Fibonacci Series: " + num2);
            } else {
                System.out.print("Fibonacci Series: " + num1 + " " + num2);
                for (int i = 0; i < n - 2; i++) {
                    long sum = num1 + num2;
                    System.out.print(sum + " ");
                    num1 = num2;
                    num2 = sum;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
