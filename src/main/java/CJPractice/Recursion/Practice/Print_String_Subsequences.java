package CJPractice.Recursion.Practice;

import java.util.Scanner;

public class Print_String_Subsequences {
    static int ans = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp_string = s.next();
        printStringSubsequence(inp_string, "");
        System.out.println();
        System.out.println(ans);

    }

    public static void printStringSubsequence(String inp_string, String path){
        if(inp_string.isEmpty()){
            System.out.print(path + " ");
            ans++;
            return;
        }


        char to_be_explored = inp_string.charAt(0);
//        char to_be_explored = inp_string.charAt(inp_string.length() - 1);
        String remaining_inp_string = inp_string.substring(1);
        printStringSubsequence(remaining_inp_string, path);
        printStringSubsequence(remaining_inp_string, path + to_be_explored);


    }
}
