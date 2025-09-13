package com.assignments.first_java;

import java.util.InputMismatchException;
import java.util.Scanner;


public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Principal: ");
            float principal = sc.nextFloat();
            System.out.print("Enter Rate: ");
            float rate = sc.nextFloat();
            System.out.print("Enter time(yrs): ");
            float time = sc.nextFloat();
            if (principal < 0 || rate < 0 || time < 0) {
                System.out.println("Values shouldn't be negative");
            } else {
                float interest = (principal * rate * time) / 100;
                System.out.println("Simple Interest: " + interest);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            sc.close();
        }
    }
}
