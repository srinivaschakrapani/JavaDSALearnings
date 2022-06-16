package CJPractice.Arrays;
//max sub arraty sum with display
// Using 3 loops
// COmplexity O(N^3)
public class MaximumSubarraySumKadane {
    public static void main(String[] args) {
//        int []  arr = {100, 200, -310, 50, 5 , -99, 900, 100};
        int []  arr = {-1, -2, -3};
        maxSubArraySumKadanes(arr);
    }

    public static void maxSubArraySumKadanes(int[] arr){
        int max_sum = Integer.MIN_VALUE;
        int local_max = 0;
        for(int val : arr){
            local_max = local_max + val;
            max_sum = Math.max(max_sum , local_max);
            if(local_max < 0){
                local_max = 0;
            }
        }
        System.out.println("  max sub array sum " + max_sum );
    }
}
