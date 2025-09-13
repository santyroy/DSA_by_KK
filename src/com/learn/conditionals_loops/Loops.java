package com.learn.conditionals_loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }

        // while loop
        int num = 0;
        while (num <= 5) {
            System.out.println(num);
            num++;
        }

        // do while loop
        int num2 = 0;
        do {
            System.out.print(num2 + " ");
            num2++;
        } while (num2 < 5);

        // use for loop when we know how many times the loop should be executed
        // example: print numbers till 'n'
        // use while loop when you don't know when how many times the loop should be executed
        // example: keep taking inputs from user until user enters 'x'

    }
}
