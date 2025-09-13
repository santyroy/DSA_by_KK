package com.assignments.first_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LargestOfTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            float num1 = sc.nextFloat();
            System.out.println("Enter second number: ");
            float num2 = sc.nextFloat();
            if (num1 == num2) {
                System.out.println(num1 + " and " + num2 + " are equal");
            } else if (num1 > num2) {
                System.out.println(num1 + " is greater than " + num2);
            } else {
                System.out.println(num2 + " is greater than " + num1);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
