package CJPractice.StringBasics;

import java.util.Scanner;

public class PlayingWithGoodStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp_string = s.next();
//        findLongestGoodString("cbaeicde");
        findLongestGoodString(inp_string);

    }

    public static void findLongestGoodString(String inp_string) {
        int start_idx = 0;
        int end_idx = -1;
        String ans = "";
        int curr_max_str_len = Integer.MIN_VALUE;
        String final_ans = "";
        while (start_idx < inp_string.length()) {
            if (inp_string.charAt(start_idx) == 'a' || inp_string.charAt(start_idx) == 'e' || inp_string.charAt(start_idx) == 'i' || inp_string.charAt(start_idx) == 'o' || inp_string.charAt(start_idx) == 'u') {
//                end_idx = start_idx == inp_string.length() - 1 ? start_idx : start_idx + 1;
                end_idx = start_idx;
//                ans = ans + inp_string.charAt(start_idx);
                while (end_idx < inp_string.length()) {
                    if (inp_string.charAt(end_idx) == 'a' || inp_string.charAt(end_idx) == 'e'
                            || inp_string.charAt(end_idx) == 'i' || inp_string.charAt(end_idx) == 'o'
                            || inp_string.charAt(end_idx) == 'u') {
                        ans = ans + inp_string.charAt(end_idx);
                        end_idx++;
                        start_idx = end_idx;
                    } else {
                        //Streak is broken
//                        start_idx = end_idx;
                        break;

                    }

                }


            } else {
                start_idx++;
            }
            if (curr_max_str_len < ans.length()) {
                final_ans = ans;
                curr_max_str_len = ans.length();
                ans = "";

            }
        }
        System.out.println(final_ans.length());
    }
}
