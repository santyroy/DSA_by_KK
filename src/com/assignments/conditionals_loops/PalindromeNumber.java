package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            long n = sc.nextLong();
            if(n < 0) {
                System.out.println("Number should not be negative");
                return;
            }
            long temp = n;
            long result = 0;
            while (n != 0) {
                long d = n % 10;
                result = result * 10 + d;
                n = n / 10;
            }
            System.out.println(temp == result ? "Palindrome" : "Not a Palindrome");
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
