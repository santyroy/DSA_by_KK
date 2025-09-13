package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LargestOfAllUserInputNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Press 0 to exit program and print largest");
            Integer largest = null;
            int n;
            do {
                System.out.println("Enter an integer:");
                n = sc.nextInt();
                if (largest == null) {
                    largest = n;
                } else {
                    if (n > largest) {
                        largest = n;
                    }
                }
            } while (n != 0);
            System.out.printf("Largest: %d", largest);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
