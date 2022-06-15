package LeetCode.Easy;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

public class SentenceIsPangram {
    public static void main(String[] args) {
//        checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
        checkIfPangram("anmt");
    }
    public static boolean checkIfPangram(String sentence) {
        boolean[] b = new boolean[26];
        boolean retVal = true;
     for(int i = 0; i < sentence.length(); i++){
//         System.out.println(sentence.charAt(i));
         b[sentence.charAt(i) - 'a'] = true;
     }
     for(boolean x : b){
        retVal = retVal && x;
         if(!retVal){
             break;
         }
     }
return retVal;
    }
}
