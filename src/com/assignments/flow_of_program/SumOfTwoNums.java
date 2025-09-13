package com.assignments.flow_of_program;

import java.util.Scanner;

public class SumOfTwoNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of " + num1 + " + " + num2 + " = " + sum);
    }
}
