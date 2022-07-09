package CJPractice.Arrays.Faang;

import java.util.Scanner;

public class FormMinimumNumberFromGivenSequence {
    public static void main(String[] args) {
//        formSequence("DDDD");
//        formSequence("III");
//        formSequence("DIDI");
        Scanner s = new Scanner(System.in);
        int no_of_test_cases = s.nextInt();
        while(no_of_test_cases > 0){
            String inp_string = s.next();
            formSequence(inp_string);
        }

    }
    public static void formSequence(String inp_seq){
        String ans = "1";
        int last_seen_num = 1;
        String tempstring = "";
        for (int i = 0; i < inp_seq.length(); i++) {
            if(inp_seq.charAt(i) == 'D'){
                last_seen_num++;
                ans = last_seen_num + ans;

            }

            else {
                last_seen_num++;
                //ans = ans + last_seen_num;
                tempstring = tempstring + ans;
                ans = "";
                ans = last_seen_num + ans;
            }

        }
        tempstring = tempstring + ans;
        System.out.println(tempstring);
    }
}
