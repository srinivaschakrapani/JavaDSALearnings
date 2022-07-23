package CJPractice.Recursion.CR;

public class LexicographicCounter {
    public static void main(String[] args) {
        printLexicographic(0,1000);

    }

    public static void printLexicographic(int curr, int limit) {
        // -ve Base case
        if(curr > limit){
            return;
        }

        System.out.println(curr);
        int digit = 0;
        if(curr == 0){
            digit = 1;
        }
        for ( ;digit < 9; digit++) {
            printLexicographic(curr * 10 + digit, limit);
        }
    }
}
