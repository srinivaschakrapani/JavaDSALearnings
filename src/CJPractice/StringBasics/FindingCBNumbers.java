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

 <<<<< Algo >>>>>>
 1. For every length from 1 to length of string
 2. Populate the indexes that are visited so far, initial set to false
 3. Find the substring of lenght 1
    3.1 Find if that / or any part of the substring is visited so far
    3.2 if not find if it is a CB number
    3.3 if that is Cb number then set the indexes in the visited array to true
*/
package CJPractice.StringBasics;

public class FindingCBNumbers {
    public static void main(String[] args) {
//        findCBNumbers("81615");
//        Scanner s = new Scanner(System.in);
//        int inp_num_size = s.nextInt();
//        String inp_num = s.next();
        String inp_num = "81615";
        findCBNumbers(inp_num);

    }

    public static void findCBNumbers(String number) {
        int count_cb_nums = 0;

        //Boolean array to track the indexes that are already visited CB numbers
        Boolean[] visited_cb_numbers_indexes = new Boolean[number.length()];
        for (int i = 0; i < visited_cb_numbers_indexes.length; i++) {
            visited_cb_numbers_indexes[i] = false;
        }

        //For every length of the string starting from 1 to length
        for (int len = 1; len <= number.length(); len++) {
            for (int i = 0; i < number.length(); i = i + 1) {
                if (len + i <= number.length()) {
                    String inp_number = number.substring(i, len + i);

                    //Check if the sub string is already visited
                    boolean visited = false;
                    int j = i;
                    while (j < i + len) {
                        visited = visited || visited_cb_numbers_indexes[j];
                        j++;
                    }

                    if (!visited) {
                        if (isCbNumber(inp_number)) {
                            count_cb_nums++;
                            System.out.println("CB Number >> " + inp_number);
                            j = i;
                            while (j < i + len) {
                                visited_cb_numbers_indexes[j] = true;
                                j++;
                            }
                        }


                    } else {
                        continue;
                    }
//                    System.out.println("Input number of Length >> " + len + " >> " + inp_number);
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
