package com.learn.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    static void main() {
        // syntax
        ArrayList<Integer> list = new ArrayList<>();
        list.add(67);
        list.add(23);
        list.add(89);
        list.add(675);
        list.add(234);
        list.add(6788);

        System.out.println(list);

        list.add(1, 99); // insert at index 1 and move all elements adjacent

        System.out.println(list);

        System.out.println(list.contains(1234));

        list.set(0, 10); // update element at given index

        System.out.println(list);

        list.remove(5); // remove element from given index

        System.out.println(list);

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
