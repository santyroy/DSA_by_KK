package com.assignments.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter marks:");
            int marks = sc.nextInt();
            if (marks > 100) {
                System.out.println("Marks cannot be greater than 100");
                return;
            }
            displayGrade(marks);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }

    static void displayGrade(int marks) {
        if (marks >= 91) {
            System.out.println("AA");
        } else if (marks >= 81) {
            System.out.println("AB");
        } else if (marks >= 71) {
            System.out.println("BB");
        } else if (marks >= 61) {
            System.out.println("BC");
        } else if (marks >= 51) {
            System.out.println("CD");
        } else if (marks >= 41) {
            System.out.println("DD");
        } else {
            System.out.println("Fail");
        }
    }
}
