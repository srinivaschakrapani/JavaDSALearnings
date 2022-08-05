package CJPractice.Recursion.Practice;

import java.util.Scanner;

public class TwinsUsingRecursion {
    static int ans;
    public static void main(String[] args) {
//        printRecursionTwins("AXAXA");
        Scanner s = new Scanner(System.in);
        String inp_str = s.next();
        printRecursionTwins(inp_str);
        System.out.println(ans);
        
    }
    
    public static void printRecursionTwins(String str){
        if(str.length() <3){
            return;
        }
        String to_be_verified = str.substring(0, 3);
        System.out.println(to_be_verified);
        if(verifyIfTwins(to_be_verified)){
            ans++;
        }
        String rem_str = str.substring(1);
        printRecursionTwins(rem_str);
    }
    public static boolean verifyIfTwins(String str){
        boolean ans = false;
        if(str.length() == 3 && str.charAt(0) == str.charAt(2)){
            ans = true;
        }
        return ans;
    }
}
