package CJPractice.Recursion.Practice;

import java.util.Scanner;

public class KeypadCodes {
    static int ans = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp_str = s.next();
        printCode(inp_str, "");
        System.out.println("\n" + ans);

    }

    public static void printCode(String inp_num, String path) {
        if (inp_num.isEmpty()) {
            System.out.print(path + " ");
            ans++;
            return;
        }

        String to_process = inp_num.substring(0, 1);
        String rem_str = inp_num.substring(1);
        String code = getCode(to_process);
        for (int i = 0; i < code.length(); i++) {
            printCode(rem_str, path + code.charAt(i));
        }

    }

    public static String getCode(String n) {
        if (n.equals("1")) {
            return "abc";
        } else if (n.equals("2")) {
            return "def";
        } else if (n.equals("3")) {
            return "ghi";
        } else if (n.equals("4")) {
            return "jkl";
        } else if (n.equals("5")) {
            return "mno";
        } else if (n.equals("6")) {
            return "pqrs";
        } else if (n.equals("7")) {
            return "tuv";
        } else if (n.equals("8")) {
            return "wx";
        } else {
            return "yz";
        }

    }
}
