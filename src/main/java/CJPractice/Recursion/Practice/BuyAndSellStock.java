/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/
package CJPractice.Recursion.Practice;

import java.util.Scanner;

public class BuyAndSellStock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();

        }
        int buy_idx = 0;
        int sell_idx = buy_idx + 1;
        int max_profit = 0;

        while ((buy_idx < sell_idx) && sell_idx < arr.length) {
            int profit = arr[sell_idx] - arr[buy_idx];
            if (profit <= 0) {
                buy_idx = sell_idx;
                sell_idx++;
            } else {
                sell_idx++;
                max_profit = Math.max(max_profit, profit);
            }

        }
        System.out.println(max_profit);
    }
}