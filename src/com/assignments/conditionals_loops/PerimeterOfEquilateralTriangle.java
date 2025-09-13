package com.assignments.conditionals_loops;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter one side of an Equilateral Triangle");
            double side = sc.nextDouble();
            if (side < 0) {
                System.out.println("Side cannot be negative");
                return;
            }
            double perimeter = 3 * side;
            System.out.printf("Perimeter of triangle: %.2f", perimeter);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
