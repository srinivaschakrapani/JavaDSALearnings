package CJPractice.Recursion.Practice;

import java.util.Scanner;

/*
Input Format
Enter the string


Constraints
None


Output Format
Display the number of ASCII-subsequences and display all the ASCII- subsequences


Sample Input
ab
Sample Output
 b 98 a ab a98 97 97b 9798
9
 */
public class AsciiSubsequences {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp_string = s.next();

        generateASCIISubsequences(inp_string, "");
    }

    public static void generateASCIISubsequences(String inp_str, String path){
        if(inp_str.length() == 0){
            System.out.println(path);
            return;
        }
        //BP : Poori string ka subsequence nikalna
        //SP : string ke length - 1 ke saare sub sequence nikalna
        String to_process = inp_str.substring(0,1);
        String remaining = inp_str.substring(1);
        generateASCIISubsequences(remaining, path);
        generateASCIISubsequences(remaining, path+to_process);
        generateASCIISubsequences(remaining, path+(int)to_process.charAt(0));


    }
}
