package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter radius of sphere");
            double radius = sc.nextDouble();

            if (radius < 0) {
                System.out.println("All dimensions must be non-negative");
                return;
            }
            double volume = (4 * Math.PI * radius * radius * radius) / 3;
            System.out.printf("Volume of sphere: %.2f", volume);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
