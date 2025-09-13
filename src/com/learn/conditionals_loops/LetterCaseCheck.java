package com.learn.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LetterCaseCheck {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        try {
//            System.out.println("Enter a character/letter: ");
//            String c = sc.next();
//            char[] chars = c.toCharArray();
//            char ch = c.charAt(0);
//            if (chars.length > 1) {
//                System.out.println("Please input a single letter/character");
//            } else {
//                int asciiCode = chars[0];
//                if (asciiCode >= 65 && asciiCode <= 90) {
//                    System.out.println("Character is UpperCase");
//                } else if (asciiCode >= 97 && asciiCode <= 122) {
//                    System.out.println("Character is LowerCase");
//                } else {
//                    System.out.println("Not an alphabet");
//                }
//            }
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid Input");
//        } finally {
//            sc.close();
//        }

        Scanner sc2 = new Scanner(System.in);
        try {
            System.out.println("Enter a character/letter: ");
            String c = sc2.next();
            if (c.length() > 1) {
                System.out.println("Please input a single letter/character");
            } else {
                char ch = c.charAt(0);
                if (ch >= 'A' && ch <= 'Z') {
                    System.out.println("Character is UpperCase");
                } else if (ch >= 'a' && ch <= 'z') {
                    System.out.println("Character is LowerCase");
                } else {
                    System.out.println("Not an alphabet");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc2.close();
        }

//        System.out.println(Character.isUpperCase('B')); // true
//        System.out.println(Character.isLetter('@')); // false
    }
}
