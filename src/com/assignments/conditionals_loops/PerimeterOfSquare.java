package com.assignments.conditionals_loops;

import java.util.Scanner;
import java.util.InputMismatchException;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter side of Square");
            double side = sc.nextDouble();
            if (side < 0) {
                System.out.println("Side or Base cannot be negative");
                return;
            }
            double perimeter = 4 * side;
            System.out.printf("Perimeter of Square: %.2f", perimeter);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
