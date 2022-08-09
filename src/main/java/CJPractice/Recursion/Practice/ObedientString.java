package CJPractice.Recursion.Practice;

import java.util.Scanner;

/*
a. the string begins with an 'a'
b. each 'a' is followed by nothing or an 'a' or "bb"
c. each "bb" is followed by nothing or an 'a' Print the value returned.
 */
public class ObedientString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp_str = s.next();
        if (!inp_str.startsWith("a")) {
            System.out.println(false);
        } else {
            System.out.println(isObedientString(inp_str));
        }
//        System.out.println(isObedientString("abbaba"));

    }

    public static boolean isObedientString(String inp_str) {
        if (inp_str.length() == 0) {
            return true;
        }

        if (inp_str.charAt(0) == 'a') {
            boolean sp1 = inp_str.length() == 1;
            boolean sp2 = inp_str.length() > 1 && inp_str.charAt(1) == 'a' && isObedientString(inp_str.substring(1));
            boolean sp3 = inp_str.indexOf("bb") == 1 && isObedientString(inp_str.substring(1));
            return sp1 || sp2 || sp3;

        } else if (inp_str.startsWith("bb")) {
            boolean sp1 = inp_str.length() == 2;
            boolean sp2 = inp_str.length() > 2 &&
                    inp_str.charAt(2) == 'a' &&
                    isObedientString(inp_str.substring(2));

            return sp1 || sp2;

        } else {
            return false;
        }

    }

}
