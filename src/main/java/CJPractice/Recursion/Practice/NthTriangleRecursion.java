package CJPractice.Recursion.Practice;

public class NthTriangleRecursion {
    public static void main(String[] args) {
        int N = 3;
        System.out.println(nthTriangle(N, 0,0));

    }

    public static int nthTriangle(int N, int idx, int ans) {
        if(N==0){
            return 0;
        }

        int sp = nthTriangle(N - 1, idx + 1, ans);
        ans = idx + sp;
        return ans;
    }
}
