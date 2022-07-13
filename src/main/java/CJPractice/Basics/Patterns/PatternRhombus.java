package CJPractice.Basics.Patterns;

import java.util.Scanner;

public class PatternRhombus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int row = 1;
        int nst = 1;
        int nsp = N-1;
        int srn = 1;
        while(row <= (2*N -1)){
            int csp = 0;
            while(csp<nsp){
                System.out.print("\t");
                csp++;
            }
            int cst = 0;
            int ntp = srn;

            while(cst < nst){
                System.out.print(ntp + "\t");

                if(cst < nst/2){
                    ntp++;
                }
                else{
                    ntp--;

                }
                cst ++;
            }
            row++;
            System.out.println();
            if(row <= N){
                nst +=2;
                nsp --;
                srn ++;
            }
            else{
                nst-=2;
                nsp++;
                srn--;
            }

        }
    }
}
