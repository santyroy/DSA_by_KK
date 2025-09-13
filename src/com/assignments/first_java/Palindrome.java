package com.assignments.first_java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a word");
            String word = sc.next().trim().toLowerCase();
            char[] letters = word.toCharArray();
            int length = word.length();
            boolean isPalindrome = true;
            int i = 0;
            int j = length - 1;
            while (i < j) {
                if (letters[i] != letters[j]) {
                    isPalindrome = false;
                    break;
                }
                i++;
                j--;
            }
            if (isPalindrome) {
                System.out.println(word + " is Palindrome");
            } else {
                System.out.println(word + " is not Palindrome");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }
    }
}
