package CJPractice.Recursion.Practice;
/*
Input Format
Single line input containing a string


Constraints
Length of string <= 10


Output Format
Display all the words which are in dictionary order larger than the string entered in a new line each.
The output strings must be sorted.


Sample Input
cab

Sample Output
cba
Explanation
The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" .
Only one of them is lexicographically greater than "cab". We only print "cba".
 */
import java.util.ArrayList;
import java.util.Collections;

public class DictionaryOrder_Larger {
    static ArrayList<String> al = new ArrayList<String>();

    public static void main(String[] args) {
        printPermutation("cab", "", "cab");
        Collections.sort(al);
//        System.out.println(al);
        for (String x : al){
            System.out.println(x);
        }
    }

    public static void printPermutation(String inp_str, String path_to_print, String inp_str_orig) {
        if (inp_str.isEmpty()) {
            if (path_to_print.compareTo(inp_str_orig) > 0) {
//                System.out.println(path_to_print);
                al.add(path_to_print);
            }
            return;
        }

        String to_add = inp_str.substring(0, 1);
        String rem_str = inp_str.substring(1);
        for (int i = 0; i <= path_to_print.length(); i++) {
            printPermutation(rem_str, path_to_print.substring(0, i) + to_add + path_to_print.substring(i, path_to_print.length()), inp_str_orig);

        }


    }

}
