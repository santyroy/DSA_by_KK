package com.assignments.flow_of_program;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        // check if year is leap
        // if year is divisible by 4 & 400
        // but not exactly divisible by 100
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not Leap year");
        }
    }
}
