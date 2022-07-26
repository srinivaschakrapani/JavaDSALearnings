package CJPractice.Recursion.Practice;

public class OddEvenUsingRecursion {
    public static void main(String[] args) {
        int N = 5;

        printOddDecreasingEvenIncreasing(5);

    }

    public static void printOddDecreasingEvenIncreasing(int N) {
        if (N == 0) {
            return;
        }
        if (N % 2 == 0) {
            printOddDecreasingEvenIncreasing(N - 1);
            System.out.println(N);
        } else {
            System.out.println(N);
            printOddDecreasingEvenIncreasing(N - 1);
        }
    }
}
