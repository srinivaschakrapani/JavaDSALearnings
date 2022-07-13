package CJPractice.Arrays.Faang;

import java.util.HashMap;

public class NumberToWord {
    public static void main(String[] args) {
        int inp_num = 897654120;
        HashMap<Integer, String> hm = new HashMap();
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
        hm.put(4, "four");
        hm.put(5, "five");
        hm.put(6, "six");
        hm.put(7, "seven");
        hm.put(8, "eight");
        hm.put(9, "nine");
        hm.put(0, "zero");

        System.out.println(hm);
        int num  = reverse(inp_num);

        String ntp = "";
        while(num > 0){
            int k = num %10;
             ntp = hm.get(k);
            num = num / 10;
            System.out.print(ntp + " ");
        }

    }

    public static int reverse(int num){
        int output = 0;
        while(num > 0){
            output = output * 10 +  num %10;;
            num = num / 10;

        }
        System.out.println(output);
        return output;
    }


}
