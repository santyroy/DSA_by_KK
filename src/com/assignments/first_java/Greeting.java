package com.assignments.first_java;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        try {
            String name = sc.nextLine();
            if(!name.trim().isEmpty()) {
                System.out.println("Hello! " + name);
            } else {
                System.out.println("Empty input");
            }
        } catch (Exception e) {
            System.out.println("Invalid String");
        } finally {
            sc.close();
        }
    }
}
