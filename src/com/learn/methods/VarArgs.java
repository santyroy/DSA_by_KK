package com.learn.methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        sum(1, 2, 3, 4);
        multiple(1,2, "Hi", "Hello", "Hola");

    }

    // variable length arguments must be the last parameters in the function definition
    static void multiple(int a, int b, String... var) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(var));
    }

    static void sum(int... nums) {
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
