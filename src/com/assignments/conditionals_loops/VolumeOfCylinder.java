package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter height of cylinder");
            double height = sc.nextDouble();
            System.out.println("Enter radius of cylinder");
            double radius = sc.nextDouble();

            if (height < 0 || radius < 0) {
                System.out.println("All dimensions must be non-negative");
                return;
            }
            double volume = Math.PI * radius * radius  * height;
            System.out.printf("Volume of cylinder: %.2f", volume);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
