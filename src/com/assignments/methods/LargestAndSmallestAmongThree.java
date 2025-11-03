package com.assignments.methods;

import java.util.Scanner;
import java.util.InputMismatchException;

public class LargestAndSmallestAmongThree {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number");
            int num1 = sc.nextInt();
            System.out.println("Enter second number");
            int num2 = sc.nextInt();
            System.out.println("Enter third number");
            int num3 = sc.nextInt();

            int largest = findLargest(num1, num2, num3);
            int smallest = findSmallest(num1, num2, num3);

            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input. Please enter valid integers.");
        }
    }

    public static int findLargest(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num3) {
            return num2;
        } else {
            return num3;
        }

        // OR use Math class
//        return Math.max(num1 , Math.max(num2, num3));
    }

    public static int findSmallest(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num3) {
            return num2;
        } else {
            return num3;
        }

//        return Math.min(num1, Math.min(num2, num3));
    }
}
