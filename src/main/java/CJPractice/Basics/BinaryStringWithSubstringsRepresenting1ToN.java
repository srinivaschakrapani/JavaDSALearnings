package CJPractice.Basics;

import java.util.Scanner;

public class BinaryStringWithSubstringsRepresenting1ToN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp_bin_number = s.next();
        long range = s.nextLong();
        int count = 1;
        boolean res = true;
        while(range > 0){
            String bin_repr = ConvertToBinary(range);
            res = res && inp_bin_number.contains(bin_repr);
            range--;
        }
        System.out.println(res);
    }

    public static String ConvertToBinary(long n) {
        long inp_num = n;
        StringBuilder bin_inp_repr = new StringBuilder();
        while(inp_num > 0){
            long rem = inp_num % 2;
            bin_inp_repr.append(rem);
            inp_num = inp_num / 2;
        }
        //reverse the string
        bin_inp_repr.reverse();
//        System.out.println(bin_inp_repr);
        return bin_inp_repr.toString();
    }
}
