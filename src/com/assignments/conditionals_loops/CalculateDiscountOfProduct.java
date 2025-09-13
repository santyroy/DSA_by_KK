package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateDiscountOfProduct {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the original price of product");
            double originalPrice = sc.nextDouble();
            if (originalPrice < 0) {
                System.out.println("Price cannot be negative");
                return;
            }
            System.out.println("Enter the discount percentage between 0 and 100");
            double discountPercent = sc.nextDouble();
            if (discountPercent < 0 || discountPercent > 100) {
                System.out.println("Discount % cannot be negative or greater than 100");
                return;
            }
            double discount = (discountPercent / 100) * originalPrice;
            System.out.printf("Discounted Price: %.2f", (originalPrice - discount));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
