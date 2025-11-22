package com.learn.arrays;

import java.util.Arrays;

public class Swap {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = null;
//        int[] arr = {};
//        int[] arr = new int[2];
        System.out.println(Arrays.toString(arr));
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
        swap(arr, 0, 2);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array must be initialized");
            return;
        }

        if (index1 > arr.length - 1 || index2 > arr.length - 1 || index1 < 0 || index2 < 0) {
            System.out.println("Indices must be between 0 and " + (arr.length - 1));
            return;
        }

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
