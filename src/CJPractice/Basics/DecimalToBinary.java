package CJPractice.Basics;

public class DecimalToBinary {
    public static void main(String[] args) {
       long inp_num = 11;
       StringBuilder bin_inp_repr = new StringBuilder();
       while(inp_num > 0){
           long rem = inp_num % 2;
           bin_inp_repr.append(rem);
           inp_num = inp_num / 2;
       }
       //reverse the string
        bin_inp_repr.reverse();
        System.out.println(bin_inp_repr);
    }
}
