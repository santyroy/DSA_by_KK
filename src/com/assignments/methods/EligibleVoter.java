package com.assignments.methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EligibleVoter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your age:");
            int age = sc.nextInt();
            if (age <= 0) {
                System.out.println("Age should be greater than 0");
                return;
            }
            if (isEligibleToVote(age)) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Ineligible to vote");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }

    static boolean isEligibleToVote(int age) {
        return age >= 18;
    }
}
