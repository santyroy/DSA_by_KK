package com.assignments.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductOfTwo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number:");
            int num1 = sc.nextInt();
            System.out.println("Enter second number:");
            int num2 = sc.nextInt();
            System.out.println("Product of " + num1 + " * " + num2 + " = " + product(num1, num2));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }

    static int product(int num1, int num2) {
        return num1 * num2;
    }
}
