package com.assignments.conditionals_loops;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the side of a cube");
            double side = sc.nextDouble();
            if (side < 0) {
                System.out.println("Dimension should be non-negative");
                return;
            }
            double surfaceArea = 6 * side * side;
            System.out.printf("Total surface area of cube: %.2f", surfaceArea);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
