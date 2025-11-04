package com.assignments.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter radius of circle");
            double r = sc.nextDouble();
            if (r <= 0) {
                System.out.println("Radius should be greater than 0");
                return;
            }
            System.out.println("Area of circle = " + areaOfCircle(r));
            System.out.println("Perimeter of circle = " + perimeterOfCircle(r));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }

    static double areaOfCircle(double r) {
        return Math.PI * r * r;
    }

    static double perimeterOfCircle(double r) {
        return 2 * Math.PI * r;
    }
}
