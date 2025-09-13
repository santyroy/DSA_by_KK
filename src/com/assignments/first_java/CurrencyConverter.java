package com.assignments.first_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CurrencyConverter {
    private static final double RATE = 88.22F;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter amount (₹):");
            double amount = sc.nextDouble();
            double amountInDollar = amount / RATE;
            System.out.println("₹" + amount + " is approximately $" + amountInDollar);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
