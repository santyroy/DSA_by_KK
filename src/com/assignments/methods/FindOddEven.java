package com.assignments.methods;

import java.util.Scanner;
import java.util.InputMismatchException;

public class FindOddEven {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = sc.nextInt();
            if(isEven(num)) {
                System.out.println(num + " is even");
            } else {
                System.out.println(num + " is odd");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
