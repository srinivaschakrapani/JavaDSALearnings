package CJPractice.Recursion.CR;
//for every character 3 options
// include it
// exclude it
// include its ASCII
public class SubSequenceASCII {
    public static void main(String[] args) {
        printSubSequence("ab", "");

    }
    public static void printSubSequence(String word , String path){
        if (word == ""){
            System.out.println(path);
            return;
        }


        char ch = word.charAt(0); //First character ke baare mein socho
        String rem = word.substring(1); //remaining String
        printSubSequence(rem, path);
        printSubSequence(rem, path + ch);
        printSubSequence(rem, path + (ch - 'a'));


    }
}
