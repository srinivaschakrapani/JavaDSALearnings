package CJPractice.HashMap.CR;

import java.util.HashMap;

public class LongestPossibleSequenceOfIntegers {
    public static void main(String[] args) {
        int[] arr = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
        longestSequence(arr);
    }

    public static void longestSequence(int[] arr1) {
        HashMap<Integer, Boolean> hm = new HashMap<>();

        for (int x : arr1) {
            if (hm.get(x - 1) != null) {
                hm.put(x - 1, true);
                hm.put(x, false);
            }
            else{
                hm.put(x, true);
            }
            if (hm.get(x + 1) != null) {
                hm.put(x + 1, false);
            }

        }
//        for (int )
//        System.out.println(hm);
    }
}
