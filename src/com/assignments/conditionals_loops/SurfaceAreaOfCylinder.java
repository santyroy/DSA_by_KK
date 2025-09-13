package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the radius of cylinder");
            double radius = sc.nextDouble();
            System.out.println("Enter the height of cylinder");
            double height = sc.nextDouble();
            if (radius < 0 || height < 0) {
                System.out.println("All dimensions should be non-negative");
                return;
            }
            // 2πr² (area of 2 circular surfaces) + 2πrh (perimeter * height)
            double surfaceArea = 2 * (Math.PI * radius * radius) + 2 * (Math.PI * radius * height);
            System.out.printf("Surface Area of cylinder: %.2f", surfaceArea);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
