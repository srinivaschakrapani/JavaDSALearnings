/*
Deepak and Gautam are having a discussion on a new type of number that
they call Coding Blocks Number or CB Number. They use following criteria to define a CB Number.

0 and 1 are not a CB number.
2,3,5,7,11,13,17,19,23,29 are CB numbers.
Any number not divisible by the numbers in point 2( Given above) are also CB numbers.
Deepak said he loved CB numbers.Hearing it, Gautam throws a challenge to him.

Gautam will give Deepak a string of digits. Deepak's task is to find the number of CB numbers in the string.

CB number once detected should not be sub-string or super-string of any other CB number.
Ex- In 4991, both 499 and 991 are CB numbers but you can choose either 499 or 991, not both.

Further, the CB number formed can only be a sub-string of the string.
Ex - In 481, you can not take 41 as CB number because 41 is not a sub-string of 481.

As there can be multiple solutions, Gautam asks Deepak to find the maximum number of CB numbers that can be formed from the given string.
 */
package CJPractice.StringBasics;

import java.util.Scanner;

public class FindingCBNumbers {
    public static void main(String[] args) {
//        findCBNumbers("81615");
        Scanner s = new Scanner(System.in);
        int inp_num_size = s.nextInt();
        String inp_num = s.next();
        findCBNumbers(inp_num);

    }

    public static void findCBNumbers(String number) {
//        int i = 0;
        int count_cb_nums = 0;
        for (int i = 0; i < number.length(); i++) {
            int j = i + 1;
            while (i < number.length() && j < number.length() + 1) {
                String temp_num = number.substring(i, j);
                if (isCbNumber(temp_num)) {
                    System.out.println(temp_num);
                    count_cb_nums++;
                    i = j;
                    j = j + 1;
                } else {
                    j++;
                }
            }
        }
        System.out.println(count_cb_nums);
    }

    public static boolean isCbNumber(String num) {
        boolean ans = true;
        long inp_num = Long.parseLong(num);

        if (inp_num == 0 || inp_num == 1) {
            ans = false;
        } else if (inp_num == 2 || inp_num == 3 || inp_num == 5 || inp_num == 7 || inp_num == 11 || inp_num == 13 || inp_num == 17 || inp_num == 19 || inp_num == 23 || inp_num == 29) {
            ans = true;

        } else if (inp_num % 2 == 0 || inp_num % 3 == 0 || inp_num % 5 == 0 || inp_num % 7 == 0 || inp_num % 11 == 0 || inp_num % 13 == 0 || inp_num % 17 == 0 || inp_num % 19 == 0 || inp_num % 23 == 0 || inp_num % 29 == 0) {
            ans = false;

        }
        return ans;

    }

}
