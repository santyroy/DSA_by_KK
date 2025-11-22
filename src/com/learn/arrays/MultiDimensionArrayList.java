package com.learn.arrays;

import java.util.ArrayList;

public class MultiDimensionArrayList {
    static void main() {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        // initializing parent list of size 3
        for (int i = 0; i < 3; i++) {
            lists.add(new ArrayList<>());
        }

        int num = 0;
        for (int i = 0; i < lists.size(); i++) {
            // initializing inner array list with 3 elements
            for (int j = 0; j < 3; j++) {
                lists.get(i).add(num++);
            }
        }

        System.out.println(lists);

        for (ArrayList<Integer> list : lists) {
            System.out.println(list);
        }
    }
}
