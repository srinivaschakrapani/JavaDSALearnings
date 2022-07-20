package CJPractice.Recursion.CR;

public class SubSequence {
    public static void main(String[] args) {
        printSubSequence("abc", "");
    }

    public static void printSubSequence(String inp_str, String path){
        if(inp_str == ""){
            System.out.println(path);
            return;
        }
        char ch = inp_str.charAt(0);
        String rem_str = inp_str.substring(1);
        printSubSequence(rem_str, path+ch);
        printSubSequence(rem_str, path);
    }
}
