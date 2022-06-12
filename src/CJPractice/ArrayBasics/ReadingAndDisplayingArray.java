package CJPractice.ArrayBasics;

/*
Same method to display two different types of Array
without using overloading
 */
public class ReadingAndDisplayingArray {
    public static void main(String[] args) {
        char[] st_nums = {1, 2, 3};
        boolean[] bool_var = {true, false , true};
        float[] f_var = {4.5f, 6.5f, 7.8f};
        String[] st_names = {"A", "B", "C"};
        display(st_nums);
        display(st_names);
        display(bool_var);
        display(f_var);
    }

    public static void display(Object a) {
        if(a instanceof byte[]){
            for(int ele : (byte[])a){
                System.out.println(ele);
            }
        }
        else if(a instanceof int[]){
            for(int ele : (int[])a){
                System.out.println(ele);
            }
        }

        else if(a instanceof short[]){
            for(int ele : (short[])a){
                System.out.println(ele);
            }
        }
        else if(a instanceof long[]){
            for(long ele : (long[])a){
                System.out.println(ele);
            }
        }
        else if(a instanceof char[]){
            System.out.println("matchedf char");
            for(int ele : (char[])a){
                System.out.println(ele);
            }
        }
        else if(a instanceof boolean[]){

            for(boolean ele : (boolean[])a){
                System.out.println(ele);
            }
        }
        else if(a instanceof float[] arr){ //JAVA 14 and beyond pattern matching in instance of

            for(float ele : arr){
                System.out.println(ele);
            }
        }
        else if(a instanceof double[]){

            for(double ele : (double[])a){
                System.out.println(ele);
            }
        }
    }
}
