package CJPractice.Recursion.CR;

public class JumpingNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 1; i++) {
            printJumpingNumbers(i, 100);
        }
    }

    public static void printJumpingNumbers(int curr, int limit) {
        if (curr > limit) {
            return;
        }


        System.out.println(curr);
        int digit = curr % 10; //Extract last digit
        if (digit > 0) {
            printJumpingNumbers(curr * 10 + (digit - 1), limit);
        }
        if(digit < 9){
            printJumpingNumbers(curr * 10 + (digit + 1), limit);
        }
    }
}
