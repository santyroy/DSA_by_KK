package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter length of pyramid");
            double length = sc.nextDouble();
            System.out.println("Enter breadth of pyramid");
            double breadth = sc.nextDouble();
            System.out.println("Enter height of pyramid");
            double height = sc.nextDouble();

            if (length < 0 || breadth < 0 || height < 0) {
                System.out.println("All dimensions must be non-negative");
                return;
            }
            double volume = (length * breadth * height) / 3;
            System.out.printf("Volume of pyramid: %.2f", volume);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
