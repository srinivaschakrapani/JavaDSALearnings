package CJPractice.MultiThreadingBasics;

public class MultipleThreads {
    public static void main(String[] args) {
        operations add = new operations("+");
        operations sub = new operations("-");

        add.start();
        sub.start();
    }
}

class operations extends Thread{
    private String operation;
    public operations(String operation){
        this.operation = operation;
    }
    @Override
    public void run() {

        if(this.operation.equals("+")){
            int result = 0;
            for (int i = 1; i < 11; i++) {
                result = result + i;
            }
            System.out.println("Addition 1-10 >>" + result);
        }
        if(this.operation.equals("-")){
            int result = 0;
            for (int i = 1; i < 11; i++) {
                result = result-i;
            }
            System.out.println("Subtracting 1-10 >>" + result);

        }
    }
}