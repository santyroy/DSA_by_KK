package com.learn;

import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your roll number: ");
        int rollNo = input.nextInt(); // You type: 25⏎
        // Scanner grabs "25", but leaves the ⏎
        System.out.println("Your roll number is " + rollNo);

        input.nextLine(); // hence we need to add this
        String name = input.nextLine(); // Immediately grabs the leftover ⏎
        // Result: name is ""
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);
    }
}
