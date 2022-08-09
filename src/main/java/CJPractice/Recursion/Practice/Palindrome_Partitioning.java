package CJPractice.Recursion.Practice;

import java.util.Scanner;

public class Palindrome_Partitioning {
    static int count_parts = 0;

    public static void main(String[] args) {
//        partitonPartition("nitin", "");
        Scanner s = new Scanner(System.in);
        int no_of_test_cases = s.nextInt();
        for (int i = 0; i < no_of_test_cases; i++) {
            String inp_str = s.next();
            count_parts = inp_str.length() - 2;
            partitonPartition(inp_str, "");
            System.out.println(count_parts);

        }
//        String inp_str = "ababbbabbababa";
    }

    public static void partitonPartition(String inp_str, String path) {
        if (inp_str.isEmpty()) {
//            System.out.println(path);
            int ans = getNoofPipes(path);
//            System.out.println(ans);
            if (count_parts > ans) {
                count_parts = ans;
            }
            //System.out.println(path.indexOf());
        }

        for (int index = 1; index <= inp_str.length(); index++) {
            String prefix = inp_str.substring(0, index);
            if (isPalindrome(prefix)) {
                String remain_str = inp_str.substring(index);
                partitonPartition(remain_str, path + prefix + "|");
            }
        }
    }

    public static boolean isPalindrome(String in_string) {
        int start_idx = 0;
        int end_idx = in_string.length() - 1;
        while (start_idx < end_idx) {
            if (in_string.charAt(start_idx) != in_string.charAt(end_idx)) {
                return false;
            }
            start_idx++;
            end_idx--;
        }
        return true;
    }

    public static int getNoofPipes(String inp_str) {
        int ans = 0;
        for (int i = 0; i < inp_str.length() - 1; i++) {
            if (inp_str.charAt(i) == '|') {
                ans++;
            }
        }
        return ans;
    }
}
