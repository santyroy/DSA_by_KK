package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter radius of the circle: ");
            double radius = sc.nextDouble();
            if (radius < 0) {
                System.out.println("Radius cannot be negative");
            } else {
                double area = Math.PI * radius * radius;
                System.out.println("Area of the circle: " + area);
                System.out.printf("Area of the circle: %f %s", area, "\n");
                System.out.printf("Area of the circle: %.2f", area);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
