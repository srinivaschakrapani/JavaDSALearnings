package CJPractice.Recursion.Practice;
/*
Convert string to Integer
 */
import java.util.Scanner;

public class ConvertStringToInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp_str = s.next();
        int x = SToI(inp_str);
        System.out.println(x);

    }

    public static int SToI(String inp_string){
        if(inp_string.isEmpty()){
            return 0;
        }
        int to_convert = Integer.parseInt(inp_string.substring(0,1));
        int sp = to_convert * (int)Math.pow(10, inp_string.length() - 1);
//        System.out.println(sp);
        return sp + SToI(inp_string.substring(1));

    }


}
