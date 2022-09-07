package CJPractice.HashMap.LeetCode.Easy;
//1078. Occurrences After Bigram
//EASY
//https://leetcode.com/problems/occurrences-after-bigram/

import java.util.ArrayList;
import java.util.HashMap;

public class OccurrencesAfterBigram {
    public static void main(String[] args) {
        String text = "alice is a good girl she is a good student", first = "a", second = "good";
        findOcurrences(text, first, second);
    }

    public static String[] findOcurrences(String text, String first, String second) {
        String[] text_split = text.split(" ");
        ArrayList<String> res = new ArrayList<>();
        HashMap<Integer, String> hm = new HashMap<>();
        int word_idx = 1;
        for (String x : text_split) {
            hm.put(word_idx, x);
            word_idx++;
        }
        //Search for the first word within keys
        for (Integer key : hm.keySet()){
            if(hm.get(key).equals(first)){
                if(hm.get(key+1)!= null && hm.get(key+1).equals(second)){
                    if(hm.get(key+2)!= null){
                        res.add(hm.get(key+2));
                    }

                }
            }
        }
//        System.out.println(hm);
        System.out.println(res);
        String[] res_final = new String[res.size()];
        int start_idx = 0;
        for (String x : res){
            res_final[start_idx] = x;
            start_idx++;
        }

        return res_final;

    }
}
