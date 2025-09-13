package com.assignments.flow_of_program;

import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        int num1 = 18;
        int num2 = 15;
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();

        // HCF
        int hcf = 1;
        if (num1 < num2) {
            while (num2 % num1 != 0) {
                int reminder = num2 % num1;
                num2 = num1;
                num1 = reminder;
            }
            hcf = num1;
        } else {
            while (num1 % num2 != 0) {
                int reminder = num1 % num2;
                num1 = num2;
                num2 = reminder;
            }
            hcf = num2;
        }
        System.out.println("hcf: " + hcf);

        // 1. LCM - Prime factorization
        // 2. LCM(a,b) = (a * b) / HCF(a,b)
        num1 = 15;
        num2 = 18;
        int lcm = 1;
        int i = 2;
        while (num1 != 1 || num2 != 1) {
            if (num1 % i == 0 || num2 % i == 0) {
                if (num1 % i == 0) {
                    num1 = num1 / i;
                }
                if (num2 % i == 0) {
                    num2 = num2 / i;
                }
                lcm = lcm * i;
                System.out.println("factor: "+ i);
            } else {
                i++;
            }
        }
        System.out.println("lcm: " + lcm);
    }
}
