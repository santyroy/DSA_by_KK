package com.learn.methods;

public class Scope {
    public static void main(String[] args) {
        // a & b are scoped only inside of this function(main), cannot be accessed outside
        int a = 1;
        int b = 2;

        sum(a, b);

        // blocked scope
        {
            // int a = 20; // not allowed to redeclare the same variable
            a = 3; // this allowed. reassigned the original variable
            int c = 4; // c cannot be accessed outside of this block
        }

        // for loop scope
        // i can only be accessed inside loop, not outside
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            int num = 90;
            // int a = 10;
        }

        int c = 100; // this is outside of block scope of can be initialized
        int i =10; // this is outside of loop scope of can be initialized

    }

    static void sum(int a, int b) {
        // a & b are scoped only inside of this function(sum), cannot be accessed outside
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}
