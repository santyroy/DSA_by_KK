package com.assignments.conditionals_loops;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * For the first 100 units: ₹1.50 per unit
 * For the next 100 units (101–200): ₹2.50 per unit
 * For the next 100 units (201–300): ₹4.00 per unit
 * Above 300 units: ₹6.00 per unit
 */

public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the power units consumed");
            int units = sc.nextInt();
            if (units < 0) {
                System.out.println("Units should be non-negative");
                return;
            }
            double amount = 0;
            if (units > 300) {
                amount += (units - 300) * 6;
                units = 300;
            }
            if (units > 200) {
                amount += (units - 200) * 4;
                units = 200;
            }
            if (units > 100) {
                amount += (units - 100) * 2.5;
                units = 100;
            }
            amount += units * 1.5;
            System.out.printf("Total Amount: %.2f", amount);
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } finally {
            sc.close();
        }


//        Scanner sc = new Scanner(System.in);
//        try {
//            System.out.println("Enter the power units consumed");
//            int units = sc.nextInt();
//
//            if (units < 0) {
//                System.out.println("Units should be non-negative");
//                return;
//            }
//
//            double amount = 0.0;
//            double slab = Math.ceil(units / 100D);
//
//            if (slab >= 4) {
//                slab = 4;
//            }
//
//            for (int i = 1; i <= slab; i++) {
//                if (i == 1) {
//                    if (units < 100) {
//                        amount += units * 1.5;
//                    } else {
//                        amount += 100 * 1.5;
//                    }
//                } else if (i == 2) {
//                    if (units < 100) {
//                        amount += units * 2.5;
//                    } else {
//                        amount += 100 * 2.5;
//                    }
//                } else if (i == 3) {
//                    if (units < 100) {
//                        amount += units * 4;
//                    } else {
//                        amount += 100 * 4;
//                    }
//                } else {
//                    amount += units * 6;
//                }
//
//                units -= 100;
//            }
//            System.out.printf("Total Amount: %.2f", amount);
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid Input");
//        } finally {
//            sc.close();
//        }
    }
}
