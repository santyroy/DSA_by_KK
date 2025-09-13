package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the base of the Parallelogram");
            double base = sc.nextDouble();
            System.out.println("Enter the height of the Parallelogram");
            double height = sc.nextDouble();
            if (base < 0 || height < 0) {
                System.out.println("Base or Height cannot be negative");
                return;
            }
            double area = base * height;
            System.out.printf("Area of the Parallelogram: %.2f", area);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
