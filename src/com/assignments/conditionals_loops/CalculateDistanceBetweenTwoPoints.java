package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateDistanceBetweenTwoPoints {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the coordinates of point A comma separated");
            String a = sc.nextLine();
            System.out.println("Enter the coordinates of point B comma separated");
            String b = sc.nextLine();
            double x1 = Double.parseDouble(a.split(",")[0].trim());
            double y1 = Double.parseDouble(a.split(",")[1].trim());
            double x2 = Double.parseDouble(b.split(",")[0].trim());
            double y2 = Double.parseDouble(b.split(",")[1].trim());
            double temp = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
            double distance = Math.sqrt(temp);
            System.out.printf("Distance between points is: %.4f", distance);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
