package com.assignments.flow_of_program;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 6;
        int multiplierCount = 10;
        for (int i = 1; i <= multiplierCount; i++) {
            System.out.println(num + " * " + i + " = " + (i * num));
        }
    }
}
