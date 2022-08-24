package CJPractice.Recursion.Practice;

import java.util.ArrayList;

/*
Assume that value of a=1, b=2, c=3, d=4, …. z=26.
Write a recursive function (return type Arraylist) to print all possible codes for the string
Input Format
Enter a number

Output Format
Display all the possible codes

Sample Input
1125
Sample Output
[aabe, aay, ale, kbe, ky]
 */
public class CodesOfString {
    static ArrayList<String> alpha = new ArrayList<String>();
    static ArrayList<String> res = new ArrayList<String>();

    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            alpha.add(i + "");
        }

//        System.out.println(alpha);
//        System.out.println(alpha.get(33));
        codesOfStringv1("1125", "");
        System.out.println(res);
//        System.out.println(codesOfString("1125", ""));


    }

    public static ArrayList<String> codesOfString(String inp_string, String path) {
        if (inp_string.length() == 0) {
//            System.out.println(path);
            res.add(path);
            return null;
        }
        for (int len = 1; len <= inp_string.length(); len++) {

            String part = inp_string.substring(0, len);
            int part_int = Integer.parseInt(part) - 1;
            if (part_int >= 0 && part_int <= 25) {
                String part_str = alpha.get(part_int);
                String rem_str = inp_string.substring(len);
                codesOfString(rem_str, path + part_str);

            }
        }
        //return res;
        return res;
    }

    public static void codesOfStringv1(String inp_string, String path) {
        if (inp_string.length() == 0) {
//            System.out.println(path);
            res.add(path);
            return;
        }
        for (int len = 1; len <= inp_string.length(); len++) {

            String part = inp_string.substring(0, len);
            int part_int = Integer.parseInt(part) - 1;
            if (part_int >= 0 && part_int <= 25) {
                String part_str = alpha.get(part_int);
                String rem_str = inp_string.substring(len);
                codesOfStringv1(rem_str, path + part_str);

            }
        }
    }

}
