package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter height of cone");
            double height = sc.nextDouble();
            System.out.println("Enter radius of cone");
            double radius = sc.nextDouble();

            if (height < 0 || radius < 0) {
                System.out.println("Height or Radius cannot be negative");
                return;
            }
            double volume = (Math.PI * radius * radius * height) / 3;
            System.out.printf("Volume of cone: %.2f", volume);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
