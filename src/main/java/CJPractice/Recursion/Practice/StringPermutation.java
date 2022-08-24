package CJPractice.Recursion.Practice;

import java.util.ArrayList;

public class StringPermutation {
    static ArrayList<String> al = new ArrayList<String>();

    public static void main(String[] args) {
        printPermutation("cab", "");
        System.out.println(al);
    }

    public static void printPermutation(String inp_str, String path) {
        if (inp_str.isEmpty()) {
            System.out.println(path);
            if (!al.contains(path)) {
                al.add(path);
            }
            return;
        }

        String first_part = inp_str.substring(0, 1);
        String rem_str = inp_str.substring(1);
        printPermutation(rem_str, path + first_part);
        printPermutation(rem_str, first_part + path);
    }
}
