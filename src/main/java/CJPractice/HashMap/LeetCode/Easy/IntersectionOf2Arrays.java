package CJPractice.HashMap.LeetCode.Easy;
/*
350. Intersection of Two Arrays II
https://leetcode.com/problems/intersection-of-two-arrays-ii/
*/

import java.util.ArrayList;
import java.util.HashMap;


public class IntersectionOf2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {30, 20, 40, 50, 70, 30, 20, 20, 50, 60};
        int[] arr2 = {50, 80, 30, 20, 20, 20, 90, 50, 20};
        findIntersection(arr1, arr2);

    }

    public static void findIntersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();

        //pass1 Insert the first array elements to Hash Map
        for (int x : arr1) {
            if (hm1.get(x) != null) {
                int val = hm1.get(x);
                hm1.put(x, val + 1);
            } else {
                hm1.put(x, 1);
            }
        }

        for (int y : arr2) {
            if (hm1.get(y) != null && hm1.get(y) != 0) {
                System.out.println(y);
                int val = hm1.get(y);
                hm1.put(y, val - 1);
            }

        }

//        System.out.println(hm1);
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();

        //pass1 Insert the first array elements to Hash Map
        for (int x : nums1) {
            if (hm1.containsKey(x)) {
                int val = hm1.get(x);
                hm1.put(x, val + 1);
            } else {
                hm1.put(x, 1);
            }
        }
        for (int y : nums2) {
            if (hm1.containsKey(y) && hm1.get(y) != 0) {
                al.add(y);
                int val = hm1.get(y);
                hm1.put(y, val - 1);
            }

        }


        int[] ans1 = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans1[i] = al.get(i);
        }
        return ans1;

    }
}
