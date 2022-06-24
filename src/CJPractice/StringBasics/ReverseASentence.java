package CJPractice.StringBasics;

import java.util.Arrays;

public class ReverseASentence {
    public static void main(String[] args) {
        String inp_str = "The Sky is Blue";
//        String[] test = new int[];
//        System.out.println(Arrays.toString(test));
//        reverse(test, 0, inp_str.length() - 1);
//        for (int i = 0; i < test.length; i++) {
//           if (inp_str.charAt(i) == ' '){
//
//           }

        int last_space = -1;
        while (last_space != 0) {
            last_space = inp_str.lastIndexOf(" ");
            if(last_space == -1){
                last_space = 0;
            }

            System.out.println(inp_str.substring(last_space));
            inp_str = inp_str.substring(0, last_space);

        }
    }

}
