package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the length of the Fibonacci Series:");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Length should greater than 0");
                return;
            }
            int a = 0;
            int b = 1;
            if (n == 1) {
                System.out.println(a);
            } else if (n == 2) {
                System.out.println(a + " " + b);
            } else {
                System.out.print(a + " " + b + " ");
                while (n > 2) {
                    int sum = a + b;
                    a = b;
                    b = sum;
                    System.out.print(sum + " ");
                    n--;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
