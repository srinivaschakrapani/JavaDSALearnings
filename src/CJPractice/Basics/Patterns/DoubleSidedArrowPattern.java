package CJPractice.Basics.Patterns;

public class DoubleSidedArrowPattern {
    public static void main(String[] args) {
        int N = 7;
        int row = 1;
        int nsp = N-1;
        int nsp1= 0;
        int nst1 = 1;
        int nst2 = 1;
        int nst = 0;
        while(row <= N){
            int csp = 0;
            while(csp < nsp){
                System.out.print(" ");
                csp++;
            }
            int cst1 = 0;
            while(cst1 < nst){
                System.out.println("* ");
                cst1 ++;
            }

            int csp1 = 0;
            while(csp1 < nsp1){
                System.out.print(" ");
                csp1++;
            }


            int cst2 = 0;
            while(cst2 < nst){
                System.out.println("* ");
                cst2++;
            }

            row++;

            if(row <= (N/2+1)){
                nst +=4;
                nsp -=1;

            }
            else{
                nst -=4;
                nsp +=1;

            }
            System.out.println();

        }
    }
}
