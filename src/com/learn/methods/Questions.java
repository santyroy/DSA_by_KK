package com.learn.methods;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = checkPrime(num);
        if (isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
        }

        System.out.println("Print all 3 digits Armstrong numbers");
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    static boolean isArmstrong(int num) {
        if (num < 100) {
            return false;
        }
        int original = num;
        int sum = 0;
        while (num != 0) {
            int remainder = num % 10;
            sum += remainder * remainder * remainder;
            num = num / 10;
        }
        return sum == original;
    }
}
