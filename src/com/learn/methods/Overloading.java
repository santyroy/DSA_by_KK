package com.learn.methods;

// Functions which have same name, same return type but different parameters
// 1. either number of parameters are different
// 2. type of parameters are different
// are called overloaded functions.
// This happens during compile time

public class Overloading {
    public static void main(String[] args) {
        fun(10);
        fun(10, 20);
        fun("Hello");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(int a, int b) {
        System.out.println(a + " " + b);
    }

    static void fun(String name) {
        System.out.println(name);
    }
}
