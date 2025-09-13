package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter height of prism");
            double height = sc.nextDouble();
            System.out.println("Enter base length of prism");
            double length = sc.nextDouble();
            System.out.println("Enter base width of prism");
            double width = sc.nextDouble();
            if (height < 0 || length < 0 || width < 0) {
                System.out.println("All dimensions must be non-negative");
                return;
            }
            double volume = length * width * height;
            System.out.printf("Volume of prism: %.2f", volume);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
