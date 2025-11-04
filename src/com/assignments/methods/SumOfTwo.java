package com.assignments.methods;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SumOfTwo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number:");
            int num1 = sc.nextInt();
            System.out.println("Enter second number:");
            int num2 = sc.nextInt();
            System.out.println("Sum of " + num1 + " + " + num2 + " = " + sum(num1, num2));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }

    static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
