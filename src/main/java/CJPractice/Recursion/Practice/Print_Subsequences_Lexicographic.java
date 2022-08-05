package CJPractice.Recursion.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Print all the subsequences of a string in lexicographical order.


Input Format
First line contains an integer N, the no of strings.
Next, N lines follows one string per line.


Constraints
1 < len(str) < 20


Output Format
No of subsequences one per line


Sample Input
1
ab
Sample Output

a
ab
b
 */
public class Print_Subsequences_Lexicographic {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            String inp_str = s.next();
            List<String> al = new ArrayList<String>();
            printSubsequencesLexicographic(inp_str,"", al);
            Collections.sort(al);
//            System.out.println(al);
            for (String x : al){
                System.out.println(x);
            }

        }

    }
    public static void printSubsequencesLexicographic(String inp_string, String path, List<String> al){
        if(inp_string.length() == 0){
//            System.out.println(path);
            al.add(path);
            return;
        }
        String to_see = inp_string.substring(0,1);
        String remaining = inp_string.substring(1);
        printSubsequencesLexicographic(remaining, path, al);
        printSubsequencesLexicographic(remaining, path+to_see, al);
    }
}
