package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Would you like to calculate area via \n1. Sides\n2. Diagonal\n Please press 1 or 2");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the base of the Rhombus");
                    double base = sc.nextDouble();
                    System.out.println("Enter the height of the Rhombus");
                    double height = sc.nextDouble();
                    if (base < 0 || height < 0) {
                        System.out.println("Base or Height cannot be negative");
                        return;
                    }
                    double area = base * height;
                    System.out.printf("Area of the Rhombus: %.2f", area);
                    break;
                case 2:
                    System.out.println("Enter the first diagonal of the Rhombus");
                    double d1 = sc.nextDouble();
                    System.out.println("Enter the second diagonal of the Rhombus");
                    double d2 = sc.nextDouble();
                    if (d1 < 0 || d2 < 0) {
                        System.out.println("Diagonals cannot be negative");
                        return;
                    }
                    double a = 0.5 * d1 * d2;
                    System.out.printf("Area of the Rhombus: %.2f", a);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
