package CJPractice.Basics;

import java.util.Scanner;

public class AnyToAnyConversion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sb = s.nextInt();
        int db = s.nextInt();
        int sn = s.nextInt();

        int sn_decimal = 0;
        int sn_db = 0;
        int idx = 0;
        while (sn > 0) {
            sn_decimal = sn_decimal + (int) Math.pow(sb, idx) * (sn % 10);
            idx++;
            sn = sn / 10;
        }
        idx = 0;
        while (sn_decimal > 0) {
            sn_db = sn_db + (int) Math.pow(10, idx) * (sn_decimal % db);
            sn_decimal = sn_decimal / db;
            idx ++;
        }
        System.out.println(sn_db);
    }
}
