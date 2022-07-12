package CJPractice.Recursion.Classroom;

public class APowerX {

    public static void main(String[] args) {
        System.out.println(calculateAPowerX(2,10));

    }

    public static long calculateAPowerX(int a, int x) {
        if (x == 0) {
            return 1;

        }
        return a * calculateAPowerX(a, x - 1);
    }
}
