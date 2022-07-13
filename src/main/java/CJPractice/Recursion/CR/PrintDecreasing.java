package CJPractice.Recursion.CR;

public class PrintDecreasing {
    public static void main(String[] args) {
        printDecreasing(4);
        System.out.println(" ==== ");
        printIncreasing(4);
        System.out.println(" ==== ");
        printDecreasingIncreasing(4);
        System.out.println(" ==== Increasing >> Decreasing == ");
        printIncreasingDecreasing(1,4);

    }

    public static void printDecreasing(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDecreasing(n - 1);
    }

    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);

    }

    public static void printDecreasingIncreasing(int n) {
        if (n == 0) {
//            System.out.println(1);
            return;
        }
        System.out.println(n);
        printDecreasingIncreasing(n - 1);
        System.out.println(n);

    }

    public static void printIncreasingDecreasing(int s, int e) {
        if (s > e) {

            return;
        }
        System.out.println(s);
        printIncreasingDecreasing(s+1, e);
        System.out.println(s);
    }
}
