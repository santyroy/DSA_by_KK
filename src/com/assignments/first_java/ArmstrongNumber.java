package com.assignments.first_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("Negative numbers are not considered for Armstrong check.");
            } else {
                // find length of number
                int temp = num;
                int length = 0;
                while (temp != 0) {
                    temp = temp / 10;
                    length++;
                }

                // calculate armstrong
                temp = num;
                double sum = 0;
                while (temp != 0) {
                    int unit = temp % 10;
                    sum = sum + Math.pow(unit, length);
                    temp = temp / 10;
                }
                System.out.println(sum);

                if (Math.abs(sum - num) < 0.0001) {
                    System.out.println(num + " is an Armstrong number");
                } else {
                    System.out.println(num + " is not an Armstrong number");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }

    private static int pow(int a, int n) {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result = result * a;
        }
        return result;
    }
}
