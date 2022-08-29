package CJPractice.StacksAndQueues.Stacks.CR;

import java.util.ArrayList;

/*
https://leetcode.com/problems/132-pattern/
 */
public class Pattern132 {
//    static boolean ans = false;

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4};
//        int[] nums = {3,1,4,2};
//        int[] nums = {-1, 3, 2, 0};
        int[] nums = {1, 1, 1, 1, 11, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println(find132pattern(nums, al, 0));

    }

    public static boolean find132pattern(int[] arr, ArrayList<Integer> al, int idx_to_add) {
        if (idx_to_add == arr.length) {
            if (al.size() == 3) {
                System.out.println(al);
                if ((al.get(0) < al.get(2)) && (al.get(2) < al.get(1))) {
//                    System.out.println("True");
                    return true;
                }
            }
            return false;
        }
        al.add(arr[idx_to_add]);

        boolean sp1 = find132pattern(arr, al, idx_to_add + 1);
        al.remove(al.size() - 1);
        boolean sp2 = false;
        if (!sp1) {
            sp2 = find132pattern(arr, al, idx_to_add + 1);

        }
        return sp1 || sp2;

    }
}
