package com.assignments.first_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            float num1 = sc.nextFloat();
            System.out.println("Enter second number: ");
            float num2 = sc.nextFloat();
            System.out.println("Enter an operator (+,-,*,/)");
            String operator = sc.next().trim();
            float result = 0;
            if (operator.equals("+")) {
                result = num1 + num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            } else if (operator.equals("-")) {
                result = num1 - num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            } else if (operator.equals("*")) {
                result = num1 * num2;
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            } else if (operator.equals("/")) {
                if(num2 == 0) {
                    System.out.println("Cannot divide by Zero");
                } else {
                    result = num1 / num2;
                    System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
                }
            } else {
                System.out.println("Invalid operator");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
