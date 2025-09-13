package com.learn.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        // Take input from user until user press X or x
        try {
            while (true) {
                System.out.print("Enter the operator: ");
                char op = sc.next().trim().charAt(0);

                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                    System.out.print("Enter two numbers: ");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();

                    if (op == '+') {
                        result = num1 + num2;
                    }
                    if (op == '-') {
                        result = num1 - num2;
                    }
                    if (op == '*') {
                        result = num1 * num2;
                    }
                    if (op == '/') {
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Cannot divide by Zero");
                        }
                    }
                    if (op == '%') {
                        if (num2 != 0) {
                            result = num1 % num2;
                        } else {
                            System.out.println("Cannot divide by Zero");
                        }
                    }
                } else if (op == 'X' || op == 'x') {
                    break;
                } else {
                    System.out.println("Invalid Operation");
                }
                System.out.println(result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
