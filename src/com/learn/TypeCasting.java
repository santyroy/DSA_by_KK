package com.learn;

import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        // type casting
        int num = (int) 67.45F;
        System.out.println(num);

        // automatic type promotion in expression
        int a = 257;
        byte b = (byte) a; // 257 % 256 = 1
        System.out.println(b);

        byte c = 40;
        byte d = 70;
        byte e = 100;
        // here (c * d) = 2800 goes beyond range of byte.
        // Hence, JAVA automatically promotes the result into int
        // Rules:
        // 1. All byte, short & char are promoted to int
        // 2. If any variable is either long, float or double then result would be either long, float & double
        int f = (c * d) / e;
        System.out.println(f);

        byte g = 60;
        // here it will give error because multiplication will
        // automatically promote to int which cannot be stored in bytes
//        g = g * 2;

        int number = 'A';
        System.out.println(number);


        byte p = 42;
        char q = 'a';
        short r = 1024;
        int s = 50000;
        float t = 5.1F;
        double u = 0.1234;
        double result = (t * p) + (s / q) - (r - u);
        System.out.println((t * p) + " " + (s / q) + " " + (r - u));
        System.out.println(result);
    }
}
