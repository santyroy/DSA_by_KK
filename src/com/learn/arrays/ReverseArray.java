package com.learn.arrays;

import java.util.Arrays;

public class ReverseArray {
    static void main() {
        int[] arr = {2, 6, 1, 7, 3, 9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {2, 6, 1, 4, 7, 3, 9};
        reverse(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
