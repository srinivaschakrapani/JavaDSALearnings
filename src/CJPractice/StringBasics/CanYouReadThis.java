package CJPractice.StringBasics;

import java.lang.reflect.GenericDeclaration;
import java.util.Scanner;

public class CanYouReadThis {
    public static void main(String[] args) {
//        String inp_string = "IAmACompetitiveProgrammerAA";
////        String inp_string = "IAmALegend";
        Scanner s = new Scanner(System.in);
        String inp_string = s.next();

        for (int i = 0; i < inp_string.length(); ) {
            //Capital letter
            if (inp_string.charAt(i) >= 'A' && inp_string.charAt(i) <= 'Z') {
                int end_idx = i + 1;
                while (end_idx < inp_string.length() && inp_string.charAt(end_idx) >= 'a' && inp_string.charAt(end_idx) <= 'z') {
                    end_idx++;
                }
                System.out.println(inp_string.substring(i, end_idx));
                i = end_idx;
            }

        }

    }
}
