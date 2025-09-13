package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter an integer:");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Number should greater than 0");
                return;
            }
            int sum = 0;
            int product = 1;
            while (n > 0) {
                int temp = n % 10;
                sum = sum + temp;
                product = product * temp;
                n = n / 10;
            }
            System.out.printf("Product - Sum = %d", product - sum);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
