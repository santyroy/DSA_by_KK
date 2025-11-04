package com.assignments.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a natural number:");
            int num = sc.nextInt();
            if (num <= 0) {
                System.out.println("Please enter natural numbers, starting from 1");
                return;
            }
            int sum = sum(num);
            System.out.println("Sum of natural numbers:" + sum);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }

    static int sum(int num) {
        int total = 0;
        for (int i = 1; i <= num; i++) {
            total += i;
        }
        return total;

        // OR sum = (n * (n+1)) / 2

    }
}
