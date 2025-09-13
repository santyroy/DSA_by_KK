package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the side of the Equilateral Triangle");
            double s = sc.nextDouble();
            if (s < 0) {
                System.out.println("Side cannot be negative");
                return;
            }
            double area = (Math.sqrt(3) * (s * s)) / 4;
            System.out.printf("Area of equilateral triangle: %.2f", area);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
