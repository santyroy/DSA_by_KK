package com.assignments.conditionals_loops;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter length of Rectangle");
            double length = sc.nextDouble();
            System.out.println("Enter breadth of Rectangle");
            double breadth = sc.nextDouble();
            if (length < 0 || breadth < 0) {
                System.out.println("Side or Base cannot be negative");
                return;
            }
            double perimeter = 2 * (length + breadth);
            System.out.printf("Perimeter of Rectangle: %.2f", perimeter);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
