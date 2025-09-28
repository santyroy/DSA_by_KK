package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a word");
            String str = sc.next();
            if (str.length() <= 0) {
                System.out.println("Word length should be greater than 0");
                return;
            }
            StringBuilder reverse = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse.append(str.charAt(i));
            }

            System.out.println("Reverse word: " + reverse);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }
}
