package CJPractice.Recursion.CR;

public class PalindromicPartition {
    public static void main(String[] args) {
        palindromicPartition("nitin", "");

    }

    public static void palindromicPartition(String word, String path){
        if(word == ""){
            System.out.println(path);
            return;
        }


        for (int i = 1; i <= word.length(); i++) {
            String part = word.substring(0,i);
            if(isPalindrome(part)){
                String remaining = word.substring(i);
                palindromicPartition(remaining, path + "--" + part);

            }

        }
    }

    public static boolean isPalindrome(String inp_str){
        int start = 0;
        int end = inp_str.length() - 1;
        while(start < end){
            if(inp_str.charAt(start) == inp_str.charAt(end)){
                start ++;
                end --;
            }
            else {
                return false;
            }

        }
        return true;
    }

}
