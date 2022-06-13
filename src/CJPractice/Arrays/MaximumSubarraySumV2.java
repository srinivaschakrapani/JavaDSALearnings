package CJPractice.Arrays;
//max sub arraty sum with display
// Using 3 loops
// COmplexity O(N^3)
public class MaximumSubarraySumV2 {
    public static void main(String[] args) {
        int []  arr = {100, 200, -310, 50, 5 , -99, 100, 988};
        maxSubArraySumV2(arr);
    }

    public static void maxSubArraySumV2(int[] arr){
        int max_sum = Integer.MIN_VALUE;
        for(int s = 0 ; s < arr.length; s ++){
            int local_sum = 0;
            for(int e = s; e < arr.length; e++){
                local_sum += arr[e];
                max_sum = Math.max(max_sum, local_sum);
                System.out.println(" >> Sum " + local_sum);
            }
        }
        System.out.println("  max sub array sum " + max_sum );
    }
}
