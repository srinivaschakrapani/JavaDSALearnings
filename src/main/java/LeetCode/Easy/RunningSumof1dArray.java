package LeetCode.Easy;

import java.util.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/
public class RunningSumof1dArray {
    public static void main(String[] args) {
        runningSum(new int[]{1, 2, 3, 4});
        runningSum(new int[]{3,1,2,10,1});
        runningSum(new int[]{1,1,1,1,1});
    }
    public static int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i ++){
            nums[i] = nums[i] + nums[i-1];
        }
        Arrays.stream(nums).forEach(System.out::println);
        return nums;
    }
}

