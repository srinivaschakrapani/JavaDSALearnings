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

    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            alpha.add(i + "");
        }



    }


}
