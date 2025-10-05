package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter an year");
            int year = sc.nextInt();
            if (year <= 0) {
                System.out.println("Year must not be negative");
                return;
            }
            // 1. If divisible by 4 then should not be divisible by 100
            // OR
            // 2. If divisible by 4 then should be divisible by 400 also
            // (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0)
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a Leap year");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
