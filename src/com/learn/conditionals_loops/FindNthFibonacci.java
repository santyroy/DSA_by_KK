package com.learn.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindNthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number: ");
        try {
            long n = sc.nextLong();
            long a = 0;
            long b = 1;
            long sum = 0;
            if (n < 0) {
                System.out.println("Fibonacci series defined for positive integer only.");
            } else if (n == 1) {
                System.out.println(a);
            } else if (n == 2) {
                System.out.println(b);
            } else {
                for (int i = 3; i <= n; i++) {
                    sum = a + b;
                    a = b;
                    b = sum;
                }
                System.out.println(sum);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
