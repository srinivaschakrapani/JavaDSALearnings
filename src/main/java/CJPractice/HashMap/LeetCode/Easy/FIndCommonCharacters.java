package CJPractice.HashMap.LeetCode.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 1002. Find Common Characters
// https://leetcode.com/problems/find-common-characters/
public class FIndCommonCharacters {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        commonChars(words);

    }

    public static List<String> commonChars(String[] words) {
        List<HashMap<Character, Integer>> ll = new ArrayList<>();
        List<String> common_chars = new ArrayList<>();

        for (int i = 1; i < words.length; i++) {
            char[] word_spread = words[i].toCharArray();
            HashMap<Character, Integer> h1 = new HashMap<>();
            for (char x : word_spread) {
                if (h1.get(x) != null) {
                    int val = h1.get(x);
                    h1.put(x, val + 1);

                } else {
                    h1.put(x, 1);
                }

            }
            ll.add(h1);




        }

        //Take the first word and comparfe with rest
        char[] first_word_spread = words[0].toCharArray();
        for (char y : first_word_spread){
            int found_in_all = words.length-1;
            for (HashMap<Character,Integer> x : ll){
                if(x.get(y) != null && x.get(y) !=0){
                    int val = x.get(y);

                    x.put(y, val-1);
                    found_in_all--;

                }
            }
            if(found_in_all == 0){
                common_chars.add(y+"");
            }
        }

        System.out.println(common_chars);
//        for (HashMap<Character,Integer> x : ll){
//            System.out.println(x);
//        }
        return common_chars;
    }
}
