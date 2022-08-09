package CJPractice.Recursion.Practice;

import java.util.Scanner;

public class WhatISInParanthesis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp_str = s.next();

        printInParanthesis(inp_str, "");
    }

    public static void printInParanthesis(String inp_str, String path) {
        if (inp_str.length() > 0 && path != "") {
            System.out.println(path);
            return;
        }
        if(inp_str.length() == 0){
            return;
        }

        String to_peek = inp_str.substring(0, 1);
        String rem_string = inp_str.substring(1);
        if (to_peek.equals("(")) {
            path = path + inp_str.substring(1, inp_str.lastIndexOf(')'));
            printInParanthesis(rem_string, path);

        } else {
            printInParanthesis(rem_string, path);
        }
    }

}
