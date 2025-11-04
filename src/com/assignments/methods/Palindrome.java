package com.assignments.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("Number should be non-negative");
                return;
            }
            if (isPalindromeNumber(num)) {
                System.out.println("Number is palindrome");
            } else {
                System.out.println("Number is not palindrome");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }

    // result = 1
    // 123
    // 3 - (1 * 10) + 3 = 13
    static boolean isPalindromeNumber(int num) {
        int temp = num;
        int result = 0;
        while (temp != 0) {
            int r = temp % 10;
            result = (result * 10) + r;
            temp = temp / 10;
        }
        return result == num;
    }
}
