package CJPractice.HashMap.LeetCode.Easy;

import java.util.HashMap;

// LC Easy
// 242. Valid Anagram
// https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {
    public static void main(String[] args) {
        isAnagram("anagramy", "nagaramx");

    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (hm.get(x) != null) {
                int val = hm.get(x);
                hm.put(x, val + 1);

            } else {
                hm.put(x, 1);
            }

        }
//        System.out.println(hm);
        for (int i = 0; i < t.length(); i++) {
            char x = t.charAt(i);
            if (hm.get(x) != null && hm.get(x) > 0) {
                int val = hm.get(x);
                hm.put(x, val - 1);

            } else {
//                System.out.println("==== Falsify ==== ");
//                System.out.println(hm);
                return false;
            }

        }
//        System.out.println(hm);
        return true;

    }
}
