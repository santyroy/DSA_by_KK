package com.assignments.conditionals_loops;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PermutationAndCombination {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of N");
            int n = sc.nextInt();
            System.out.println("Enter the value of R");
            int r = sc.nextInt();
            if (n < 0 || n > 20) {
                System.out.println("N should be in between 0-20");
                return;
            }

            if (r < 0 || r > n) {
                System.out.println("R should be in between 0 and N");
                return;
            }

            long nFact = findFactorial(n);
            long rFact = findFactorial(r);
            long nMinusRFact = findFactorial(n - r);

            long nPR = nFact / nMinusRFact; // permutation = n! / (n-r)!
            long nCR = nFact / (nMinusRFact * rFact); // combination = n! / ((n-r)! * r!)

            System.out.println("NCr = " + nCR);
            System.out.println("NPr = " + nPR);

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }
    }

    private static long findFactorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
