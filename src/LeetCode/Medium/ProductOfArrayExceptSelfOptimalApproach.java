package LeetCode.Medium;
//238. Product of Array Except Self

import java.util.Arrays;

public class ProductOfArrayExceptSelfOptimalApproach {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int arr_len = s.nextInt();
//        long[] arr = new long[arr_len];
//        for (int i = 0; i < arr_len; i++) {
//            arr[i] = s.nextLong();
//        }
        long[] arr = { 2, 3, 4, 5};
        int[] arr1 = { 2, 3, 4, 5};
        productExceptSelfLinearTimeWithExtraSpace(arr);
        productExceptSelfLinearTimeNoExtraSpace(arr1);


    }

    public static void productExceptSelfLinearTimeWithExtraSpace(long[] arr) {
        //Prefix Array (product from 0 -> i-1)
        long mul_fact = 1;
        long[] prefix_arr = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            prefix_arr[i] = mul_fact;
            mul_fact = mul_fact * arr[i];
        }

        //Suffix Array (product from i+1 to length-1)
        mul_fact = 1;
        long[] suffix_arr = new long[arr.length];
        for (int i = arr.length -1; i >=0; i--) {
            suffix_arr[i] = mul_fact;
            mul_fact = mul_fact * arr[i];
        }
        System.out.println(Arrays.toString(prefix_arr));
        System.out.println(Arrays.toString(suffix_arr));
        long[] outputarr = new long[arr.length];
        //product of array except self
        for (int i = 0; i < arr.length; i++) {
            outputarr[i] = prefix_arr[i] * suffix_arr[i];

        }
        System.out.println(Arrays.toString(outputarr));
    }

    public static void productExceptSelfLinearTimeNoExtraSpace(int[] arr) {
        //declare output array
        int[] outputarr = new int[arr.length];
        int mul_fact = 1;
        ///prefix sum
        for (int i = 0; i < arr.length; i++) {
            outputarr[i] = mul_fact;
            mul_fact = mul_fact * arr[i];
        }
        mul_fact = 1;
        for (int i = arr.length - 1; i >=0; i--) {
            outputarr[i] = outputarr[i] * mul_fact;
            mul_fact = mul_fact * arr[i];
        }
        System.out.println(Arrays.toString(outputarr));
    }

}

