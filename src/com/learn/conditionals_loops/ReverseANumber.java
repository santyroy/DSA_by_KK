package com.learn.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter an integer number: ");
            long n = sc.nextLong();
            long reverse = 0;
            while (n != 0) {
                long remainder = n % 10;
                reverse = reverse * 10 + remainder;
                n = n / 10;
            }
            System.out.println("Reverse Number: " + reverse);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
