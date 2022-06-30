package CJPractice.StringBasics;

import java.util.Scanner;

public class MaxFrequencyCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String inp_string = s.next();
        System.out.println( getMaxFrequency(inp_string));
}

    public static char getMaxFrequency(String inp_str) {
        int max_frequency = -1;
        char max_char = inp_str.charAt(0);

        for (int i = 0; i < inp_str.length(); i++) {
            char local_max = inp_str.charAt(i);
            int local_max_frequency = 0;
            for (int j = i; j < inp_str.length(); j++) {
                if (inp_str.charAt(i) == inp_str.charAt(j)) {
                    local_max_frequency++;
                }
            }
            if (max_frequency < local_max_frequency) {
                max_char = local_max;
                max_frequency = local_max_frequency;
            }

        }
        System.out.println(max_char);
        return max_char;
    }
}
