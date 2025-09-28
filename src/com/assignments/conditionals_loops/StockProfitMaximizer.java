package com.assignments.conditionals_loops;

/*
 * You’re given an array of stock prices where prices[i] is the price of a stock on day i.
 * Goal: Find the maximum profit you can achieve by buying on one day and selling on another later day.
 * Constraints:
 *     You must buy before you sell.
 *     You can only make one transaction (i.e., buy once and sell once).
 *     If no profit is possible, return 0.
 *     Input: [7, 1, 5, 3, 6, 4]
 *     Output: 5
 *     Explanation: Buy at 1, sell at 6.
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StockProfitMaximizer {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the prices of the stock (space separate)");
            String data = sc.nextLine();
            List<Integer> stockPrices = Arrays.stream(data.split("\\s")).map(Integer::parseInt).toList();
            if (stockPrices.size() < 2) {
                System.out.println("Need at least two prices to calculate profit.");
                return;
            }
            int lowestPrice = stockPrices.get(0);
            int lowestPriceIndex = 0;
            int buyDate = 0;
            int sellDate = 0;
            int maxProfit = 0;
            for (int i = 1; i < stockPrices.size(); i++) {
                int currentPrice = stockPrices.get(i);
                if (currentPrice < lowestPrice) {
                    lowestPrice = currentPrice;
                    lowestPriceIndex = i;
                } else {
                    int diff = currentPrice - lowestPrice;
                    if (diff > maxProfit) {
                        maxProfit = diff;
                        buyDate = lowestPriceIndex;
                        sellDate = i;
                    }
                }
            }
            System.out.println("Buy Date: " + buyDate);
            System.out.println("Sell Date: " + sellDate);
            System.out.println("Output: " + maxProfit);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
