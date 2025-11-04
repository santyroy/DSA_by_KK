package com.assignments.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first side of triangle");
            int a = sc.nextInt();
            System.out.println("Enter second side of triangle");
            int b = sc.nextInt();
            System.out.println("Enter third side of triangle");
            int c = sc.nextInt();
            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Sides should be positive");
                return;
            }
            if (isPythagoreanTriplet(a, b, c)) {
                System.out.println("Is a pythagorean triplet");
            } else {
                System.out.println("Not a pythagorean triplet");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }

    }

    static boolean isPythagoreanTriplet(int a, int b, int c) {
        int side1Sqr = a * a;
        int side2Sqr = b * b;
        int side3Sqr = c * c;

        if ((side1Sqr + side2Sqr == side3Sqr) ||
                (side1Sqr + side3Sqr == side2Sqr) ||
                (side2Sqr + side3Sqr == side1Sqr)) {
            return true;
        }
        return false;
    }
}
