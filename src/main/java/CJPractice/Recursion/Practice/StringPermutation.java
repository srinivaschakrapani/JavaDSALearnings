package CJPractice.Recursion.Practice;

import java.util.ArrayList;

public class StringPermutation {
    static ArrayList<String> al = new ArrayList<String>();

    public static void main(String[] args) {
        printPermutation("cab", "");
//        System.out.println(al);
    }

    public static void printPermutation(String inp_str, String path) {
        if (inp_str.isEmpty()) {
            System.out.println(path);
            return;
        }
        String to_add = inp_str.substring(0, 1);
        String rem_str = inp_str.substring(1);
        for (int i = 0; i <= path.length(); i++) {
//            System.out.println(path);
//            path = path.substring(0, i) + to_add + path.substring(i, path.length());
            printPermutation(rem_str, path.substring(0, i) + to_add + path.substring(i, path.length()));
//            printPermutation(rem_str, path);
        }
    }
}
