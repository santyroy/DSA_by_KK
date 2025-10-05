package com.assignments.conditionals_loops;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a character");
            String c = sc.next().trim().toLowerCase();
            if (c.length() > 1) {
                System.out.println("Please enter a character not a word");
                return;
            }
            char ch = c.charAt(0);

            if ((ch >= 33 && ch <= 47) || (ch >= 58 && ch <= 64)) {
                System.out.println(ch + " is a symbol");
            } else if (ch == 48 || ch == 49 || ch == 50 || ch == 51 || ch == 52 || ch == 53 || ch == 54 || ch == 55 || ch == 56 || ch == 57) {
                System.out.println(ch + " is a digit");
            } else if ("aeiou".indexOf(ch) != -1) {
                System.out.println(ch + " is a vowel");
            } else {
                System.out.println(ch + " is a consonant");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
