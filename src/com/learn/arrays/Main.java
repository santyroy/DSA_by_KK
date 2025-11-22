package com.learn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void main() {

        // syntax
        // datatype[] variable_name = new datatype[size]

        int[] rollnos = new int[5]; // will create an array in heap = {0, 0, 0, 0, 0}
        // or
        int[] rollnos2 = {1, 2, 3, 4, 5};

        int[] rollnos3; // declaration (compile time)
        rollnos3 = new int[5]; // initialization, object is being created in heap memory (runtime/dynamic memory allocation)

        System.out.println(rollnos3[2]);

        String[] arr = new String[4]; // create a string array = {null, null, null, null}
        System.out.println(arr[2]);

        rollnos[0] = 23;
        rollnos[1] = 34;
        rollnos[2] = 10;
        rollnos[3] = 13;
        rollnos[4] = 20;
        System.out.println(rollnos[3]);

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rollnos.length; i++) {
            rollnos[i] = sc.nextInt();
        }
//        for (int i = 0; i < rollnos.length; i++) {
//            System.out.print(rollnos[i] + " ");
//        }
        for (int num : rollnos) {
            System.out.print(num + " ");
        }
        // System.out.println(rollnos[5]); // ArrayIndexOutOfBoundException

        System.out.println(Arrays.toString(rollnos));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        System.out.println(Arrays.toString(arr));

        arr[1] = "Sougata";

        System.out.println(Arrays.toString(arr));

        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));


    }

    static void change(int[] arr) {
        arr[1] = 99;
    }
}
