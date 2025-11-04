package com.assignments.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("Number should be non negative");
                return;
            }
            System.out.println("Factorial of " + num + " = " + factorial(num));
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }

    static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        int factorial = 1;
        while (num != 1) {
            factorial *= num;
            num--;
        }
        return factorial;
    }
}
