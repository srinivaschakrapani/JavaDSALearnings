package CJPractice.Recursion.Practice;

import java.util.Scanner;

public class GenerateBinaryStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 0; i < N; i++) {
            String inp_string = s.next();
            generateBinaryString(inp_string,"");
        }


    }

    public static void generateBinaryString(String inp_str, String path){
        if(inp_str.isEmpty()){
            System.out.print(path + " ");
            return;
        }

        String to_peek = inp_str.substring(0,1);
        String remaining_str = inp_str.substring(1);
        if(to_peek.equals("?")){
            generateBinaryString(remaining_str, path+"0");
            generateBinaryString(remaining_str, path+"1");
        }
        else{
            generateBinaryString(remaining_str, path+to_peek);
        }
    }
}
