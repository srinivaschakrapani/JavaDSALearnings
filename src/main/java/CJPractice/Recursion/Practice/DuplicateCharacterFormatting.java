package CJPractice.Recursion.Practice;
/*
Input Format
Enter a String


Constraints
1<= Length of string <= 10^4


Output Format
Display the resulting string (i.e after inserting (*) b/w all the duplicate characters)


Sample Input
hello
Sample Output
hel*lo
Explanation
We insert a "*" between the two consecutive 'l' .
 */
public class DuplicateCharacterFormatting {
    public static void main(String[] args) {
        formatDuplicateAdjacentLetters("hello", "");

    }

    public static void formatDuplicateAdjacentLetters(String inp_string, String path){
        if (inp_string.length() < 2){
            System.out.println(path);
            return;
        }
        //Fetch 2 characters
        String to_format = inp_string.substring(0,2);
        String remaining_str;
        if (to_format.charAt(0) == to_format.charAt(1)){
            String temp = to_format.charAt(0) + "*"+to_format.charAt(1);
            remaining_str = inp_string.substring(3);
            formatDuplicateAdjacentLetters(remaining_str, path+temp);

        }
        else{
            remaining_str = inp_string.substring(1);
            formatDuplicateAdjacentLetters(remaining_str, path+ inp_string.substring(0,1));
        }
    }
}
