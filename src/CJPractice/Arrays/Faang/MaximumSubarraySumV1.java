package CJPractice.Arrays.Faang;
//max sub arraty sum with display
// Using 3 loops
// COmplexity O(N^3)
public class MaximumSubarraySumV1 {
    public static void main(String[] args) {
        int []  arr = {100, 200, -310, 50, 5 , -99, 1000, 70};
        maxSubArraySumV1(arr);
    }

    public static void maxSubArraySumV1(int[] arr){
        int max_sum = Integer.MIN_VALUE;
        for(int s = 0 ; s < arr.length; s ++){
            for(int e = s; e < arr.length; e++){
                int local_sum = 0;
//                System.out.println(" <<< Sub Array >>>> " + arr[s] + ":" + arr[e] );
                for(int i = s; i <= e; i++){
                    System.out.print(arr[i] + " ");
                    local_sum += arr[i];
                }
                max_sum = Math.max(max_sum, local_sum);
                System.out.println(" >> Sum " + local_sum);
            }
        }
        System.out.println("  max sub array sum " + max_sum );
    }
}
