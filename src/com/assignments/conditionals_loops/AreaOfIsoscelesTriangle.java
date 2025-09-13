package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the length of the equal side of the triangle");
            double s = sc.nextDouble();
            System.out.println("Enter the length of the 3rd side of the triangle");
            double b = sc.nextDouble();
            if (s < 0 || b < 0) {
                System.out.println("Sides of triangle cannot be negative");
                return;
            }
            if (s + s <= b) {
                System.out.println("Sum of two sides of a triangle must be greater than the third side");
                return;
            }
            double halfBase = b / 2;
            double h = Math.sqrt((s * s) - (halfBase * halfBase));
            double area = 0.5 * b * h;
            System.out.printf("Area of the triangle: %f", area);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
