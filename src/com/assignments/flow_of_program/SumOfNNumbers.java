package com.assignments.flow_of_program;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.next();
        int sum = 0;
        while (!value.equalsIgnoreCase("x")) {
            try{
                sum = sum + Integer.parseInt(value.trim());
            } catch (Exception e) {
                System.out.println("Invalid number");
            }
            value = sc.next();
        }
        System.out.println("Sum = " + sum);
    }
}
