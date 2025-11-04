package com.assignments.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            if (num <= 1) {
                System.out.println("Number should be greater than 1");
                return;
            }
            if (isPrime(num)) {
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " is not prime");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }

    static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
