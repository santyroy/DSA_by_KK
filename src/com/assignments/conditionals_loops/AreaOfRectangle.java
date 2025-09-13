package com.assignments.conditionals_loops;

import java.util.Scanner;
import java.util.InputMismatchException;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter length of rectangle:");
            double l = sc.nextDouble();
            System.out.println("Enter breadth of rectangle:");
            double b = sc.nextDouble();
            if (l < 0 || b < 0) {
                System.out.println("Side of rectangle cannot be negative");
                return;
            }
            double area = l * b;
            System.out.printf("Area of rectangle: %.2f", area);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
