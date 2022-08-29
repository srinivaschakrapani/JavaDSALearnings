package CJPractice.StacksAndQueues.Stacks.CR;

import java.util.Stack;

public class StockSpan  {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<Integer>();
        int[] prices = {100,80,60,70,60,75,85};
        findStockSpan(prices, stk);

    }

    public static int[] findStockSpan(int[] prices, Stack<Integer> stk){
        int[] ans = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            if(stk.isEmpty()){
                stk.push(prices[i]);
                ans[i] = 1;
            }
            else if(prices[i] >= stk.peek()){
                stk.push(prices[i]);
                ans[i] = ans[i-1] + 1;

            } else if (prices[i] < stk.peek()) {
                stk.push(prices[i]);
                ans[i] = 1;
                
            }
        }
        for (int x: ans){
            System.out.println(x);
        }

        return ans;

    }
}
