package com.learn.methods;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);

        System.out.println(a + " " + b);

        int[] arr = {1, 2, 3};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void change(int[] nums) {
        nums[0] = 99;
    }
}
