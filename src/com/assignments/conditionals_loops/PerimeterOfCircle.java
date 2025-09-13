package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the radius of the circle");
            double radius = sc.nextDouble();
            if (radius < 0) {
                System.out.println("Radius cannot be negative");
                return;
            }
            double perimeter = 2 * Math.PI * radius;
            System.out.printf("Perimeter of circle: %.2f", perimeter);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
