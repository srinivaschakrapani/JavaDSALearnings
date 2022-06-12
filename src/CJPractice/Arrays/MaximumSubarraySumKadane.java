package CJPractice.Arrays;
//max sub arraty sum with display
// Using 3 loops
// COmplexity O(N^3)
public class MaximumSubarraySumKadane {
    public static void main(String[] args) {
        int []  arr = {100, 200, -310, 50, 5 , -99, 100, 988};
        maxSubArraySumV1(arr);
    }

    public static void maxSubArraySumV1(int[] arr){
        int max_sum = Integer.MIN_VALUE;

        System.out.println("  max sub array sum " + max_sum );
    }
}
