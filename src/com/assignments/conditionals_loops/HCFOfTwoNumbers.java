package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HCFOfTwoNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number");
            int a = sc.nextInt();
            System.out.println("Enter the second number");
            int b = sc.nextInt();
            if (a <= 0 && b <= 0) {
                System.out.println("Both numbers should be positive");
                return;
            }

            // iterative approach
//            int hcf = 1;
//            if (a > b) {
//                int remainder;
//                do {
//                    remainder = a % b;
//                    if (remainder == 0) {
//                        hcf = b;
//                    }
//                    a = b;
//                    b = remainder;
//                } while (remainder != 0);
//            } else {
//                int remainder;
//                do {
//                    remainder = b % a;
//                    if (remainder == 0) {
//                        hcf = a;
//                    }
//                    b = a;
//                    a = remainder;
//                } while (remainder != 0);
//            }
//            System.out.printf("HCF = %d", hcf);

            // iterative approach - optimized solution
            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }
            System.out.println("HCF = " + a);

            // recursive approach
            findHCF(a, b);

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }

    private static void findHCF(int a, int b) {
        if (b == 0) {
            System.out.println("HCF = " + a);
            return;
        }
        int r = a % b;
        findHCF(b, r);
    }
}
