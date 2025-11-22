package com.learn.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    static void main() {
        /*
            1 2 3
            4 5 6
            7 8 9
        */

//        int[][] arr = new int[3][]; // row is mandatory, but columns are optional.
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // This can be called as array of arrays
        // 0 index = array [1,2,3] --> 00 index = 1, 01 index = 2, 03 index = 3
        // 1 index = array [4,5,6] --> 10 index = 4, 11 index = 5, 12 index = 6
        // 2 index = array [7,8,9] --> 20 index = 7, 21 index = 8, 22 index = 9

        // Why columns are optional because the size of the 2nd dimension can vary
        /*
            1, 2
            3,
            4, 5, 6, 7
         */
        int[][] arr2 = {
                {1, 2},
                {3},
                {4, 5, 6, 7}
        };
        // 0 index = array [1, 2]
        // 1 index = array [3]
        // 2 index = array [4, 5, 6, 7]
        Scanner sc = new Scanner(System.in);
        int[][] arr3 = new int[3][2];
        System.out.println(arr3.length); // no. of rows
        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                arr3[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < arr3.length; row++) {
            for (int col = 0; col < arr3[row].length; col++) {
                System.out.print(arr3[row][col]);
            }
            System.out.println();
        }

        // using enhanced for loop
        for (int[] a : arr2) {
            System.out.println(Arrays.toString(a));
        }

    }
}
