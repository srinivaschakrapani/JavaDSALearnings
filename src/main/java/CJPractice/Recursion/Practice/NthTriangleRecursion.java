package CJPractice.Recursion.Practice;

public class NthTriangleRecursion {
    public static void main(String[] args) {
        int N = 3;
        System.out.println(nthTriangle(N));

    }

    public static int nthTriangle(int N) {
        if(N==1){
            return 1;
        }

        int sp = N+ nthTriangle(N - 1);
        return sp;
    }
}
