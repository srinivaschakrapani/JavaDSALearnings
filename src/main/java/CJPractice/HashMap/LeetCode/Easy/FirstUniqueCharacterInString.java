package CJPractice.HashMap.LeetCode.Easy;

import java.util.HashMap;

/*
EASY
387. First Unique Character in a String
https://leetcode.com/problems/first-unique-character-in-a-string/
*/
public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));

    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            // char x = s.charAt(i);
            if (hm.containsKey(s.charAt(i))) {
                int val = hm.get(s.charAt(i));
                hm.put(s.charAt(i), val + 1);

            } else {
                hm.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i)) && hm.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;

    }
}

