package LeetCode.Easy;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int con = 9;
        for(int k : twoSum(nums, con)){
            System.out.println(k);

        }
        for(int k : twoSumOverSortedarray(nums, con)){
            System.out.println(k);

        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                   res[0] = i;
                   res[1] = j;
                }
            }

        }
        return res;
    }

    public static int[] twoSumOverSortedarray(int[] nums, int target) {
        int[] res = new int[2];
        int idx1 = 0;
        int idx2 = nums.length - 1;
        while(idx2 > idx1){
            if (nums[idx1] + nums[idx2] == target) {
                res[0] = idx1 + 1;
                res[1] = idx2 + 1;
                break;
            }
            else if(nums[idx1] + nums[idx2] < target){
                idx1++;

            }
            else{
                idx2--;
            }
        }
        return res;
    }
}
