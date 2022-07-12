package CJPractice.Recursion.Classroom;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Factorial(10));

    }

    public static long Factorial(int n){
        if(n==0){
            return 1;
        }
        return n * Factorial(n-1);
    }
}
