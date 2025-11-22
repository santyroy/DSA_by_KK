package com.learn.arrays;

public class MaxInArray {
    static void main() {
//        int[] arr = null;
//        int[] arr = {};
//        int[] arr = {1};
        int[] arr = {23, 67, 34, 12, 20};
        System.out.println(findMax(arr));

        System.out.println(findMaxInRange(arr, 2, 4));
    }

    static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array must have at least two value");
            return -1;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findMaxInRange(int[] arr, int start, int end) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array must have at least two value");
            return -1;
        }
        if (start < 0 || end > arr.length - 1) {
            System.out.println("Indices must be in between 0 and " + (arr.length - 1));
            return -1;
        }
        if (start > end) {
            System.out.println("Start index cannot be greater than end index");
            return -1;
        }
        int max = arr[start];
        for (int i = start + 1; i < end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
