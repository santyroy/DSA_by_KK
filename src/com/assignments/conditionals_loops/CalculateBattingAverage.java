package com.assignments.conditionals_loops;

/**
 * Batting Avg = Total Runs / No. of Outs
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateBattingAverage {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of players");
            int n = sc.nextInt();
            if (n <= 0) {
                System.out.println("No.of players should be greater than 0");
                return;
            }

            for (int i = 1; i <= n; i++) {
                System.out.println("Enter number of matches for player-" + i);
                int m = sc.nextInt();
//                sc.nextLine(); // read the \n newline value because we have sc.nextLine() method below
                if (m <= 0) {
                    System.out.println("Avg for player " + i + " = 0");
                    continue;
                }
                int totalRuns = 0;
                int noOfOuts = 0;
                for (int j = 1; j <= m; j++) {
//                    String matchDetails = sc.nextLine();
//                    int run = Integer.parseInt(matchDetails.split(" ")[0]);
//                    int out = Integer.parseInt(matchDetails.split(" ")[1]);
                    int run = sc.nextInt();
                    int out = sc.nextInt();
                    totalRuns += run;
                    if (out == 1) {
                        noOfOuts++;
                    }
                }
                int avg = noOfOuts == 0 ? (totalRuns) : (totalRuns / noOfOuts);
                System.out.println("Avg for player " + i + " = " + avg);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        } catch (Exception e) {
            System.out.println("Error: " + e.getLocalizedMessage());
        }
    }
}
