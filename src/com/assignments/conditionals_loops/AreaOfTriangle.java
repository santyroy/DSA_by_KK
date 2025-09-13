package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter length of first side of triangle");
            double a = sc.nextDouble();
            System.out.println("Enter length of second side of triangle");
            double b = sc.nextDouble();
            System.out.println("Enter length of third side of triangle");
            double c = sc.nextDouble();
            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Triangle side cannot be zero");
                return;
            }

            if (a + b < c || b + c < a || a + c < b) {
                System.out.println("In a triangle sum of two sides should be greater than third side");
                return;
            }

            double s = (a + b + c) / 2;
            // Heron's Formula
            double areaOfTriangle = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("Area of triangle: %.2f", areaOfTriangle);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
