package com.assignments.conditionals_loops;

import java.util.*;

public class InvestmentPortfolioAnalyzer {
    public static void main(String[] args) {
        List<Investment> investments = new ArrayList<>();
        List<Performance> performances = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter no. of investments");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the name of the investment");
                String name = sc.next();
                System.out.println("Enter amount invested");
                double amountInvested = sc.nextDouble();
                if (amountInvested <= 0) {
                    System.out.println("Amount invested should be greater than 0. Please re-enter");
                    i--;
                    continue;
                }
                System.out.println("Enter current value");
                double currentValue = sc.nextDouble();
                if (currentValue <= 0) {
                    System.out.println("Current Value should be greater than 0. Please re-enter");
                    i--;
                    continue;
                }
                investments.add(new Investment(name, amountInvested, currentValue));
            }

            double totalInvestment = 0;
            double totalCurrentValue = 0;

            for (Investment investment : investments) {
                totalInvestment += investment.amountInvested();
                totalCurrentValue += investment.currentValue();
                if (investment.currentValue() > investment.amountInvested() && investment.amountInvested() > 0) {
                    double profit = ((investment.currentValue() - investment.amountInvested()) / investment.amountInvested()) * 100;
                    performances.add(new Performance(investment.name(), profit));
                } else {
                    double loss = ((investment.amountInvested() - investment.currentValue()) / investment.amountInvested()) * 100;
                    performances.add(new Performance(investment.name(), -loss));
                }
            }

            System.out.printf("Total Investment: %.2f%n", totalInvestment);
            System.out.printf("Total Current value: %.2f%n", totalCurrentValue);
            if (totalCurrentValue > totalInvestment) {
                System.out.printf("Net Profit: %.2f%n", (totalCurrentValue - totalInvestment));
            } else {
                System.out.printf("Net Loss: %.2f%n", (totalInvestment - totalCurrentValue));
            }

            // sort performance list for highest profit and loss
            performances.sort((o1, o2) -> {
//                int p1 = (int) Math.abs(o1.percentageChange);
//                int p2 = (int) Math.abs(o2.percentageChange);
//                return p2 - p1;
                return Double.compare(o2.percentageChange(), o1.percentageChange());
            });
            // OR
//            performances.sort(Comparator.comparingDouble(Performance::percentageChange));

            System.out.println(performances);
            System.out.printf("Highest Performer: %s (%.2f %s) %n", performances.get(0).name(), performances.get(0).percentageChange(), "%");
            System.out.printf("Lowest Performer: %s (%.2f %s) %n", performances.get(n - 1).name(), performances.get(n - 1).percentageChange(), "%");

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input");
        }

    }

    record Investment(String name, double amountInvested, double currentValue) {
    }

    record Performance(String name, double percentageChange) {
    }
}


