package CJPractice.StringBasics;

import java.util.Scanner;

public class PalindromicSubstringV1 {
    public static void main(String[] args) {
//        String inp_string = "tacocat";
        String inp_string = "nitin";

//        Scanner s = new Scanner(System.in);
//        String inp_string = s.next();
        int count = 0;
        for (int i = 0; i < inp_string.length(); i++) {
            for(int j = i+1; j<=inp_string.length(); j++){
                if(isPalindrome(inp_string.substring(i,j))){
                    System.out.println(inp_string.substring(i,j));
                    count ++;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean isPalindrome(String inp_string){
        int start = 0;
        int end = inp_string.length() - 1;
        boolean isPalindrome = true;
        while (start < end) {
            if (inp_string.charAt(start) == inp_string.charAt(end)) {
                start++;
                end--;
            } else {
                isPalindrome = false;
                break;

            }
        }
        return isPalindrome;
    }

}
