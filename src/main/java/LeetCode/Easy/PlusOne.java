package LeetCode.Easy;

public class PlusOne {
    public static void main(String[] args) {
        int[] testdigit = {1,0,9,9};
        int [] testdigit1 = {1,2,3,4};
        int [] testdigit2 = {9,9};
        int [] testdigit3 = {1,9};
        plusOne(testdigit);
        plusOne(testdigit2);
    }

    public static int[] plusOne(int[] digits) {
        int idx = digits.length - 1;
        int k = 1;

        while(idx >=0){
            k = digits[idx] + k;
            if(k > 9){
                digits[idx] =  k % 10;
                k = k / 10;
            }
            else{
                digits[idx] = k;
                k = 0;
                break;
            }
            idx = idx - 1;
        }

        if(k > 0 && idx == -1){
            int[] new_digits = new int[digits.length + 1];
            new_digits[0] = k;
            for(int i = 0 ; i<digits.length;i++){
                new_digits[i+1] = digits[i];
            }
            digits = new_digits;
        }

        return digits;
    }
}
