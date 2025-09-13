package com.assignments.conditionals_loops;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter side of Parallelogram");
            double side = sc.nextDouble();
            System.out.println("Enter base of Parallelogram");
            double base = sc.nextDouble();
            if (side < 0 || base < 0) {
                System.out.println("Side or Base cannot be negative");
                return;
            }
            double perimeter = 2 * (side + base);
            System.out.printf("Perimeter of parallelogram: %.2f", perimeter);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
