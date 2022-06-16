package CJPractice.MultiThreadingBasics;

public class FirstSteps extends Thread{

    @Override
    public void run(){
        for (int i = 1; i < 200; i++) {
            System.out.println("Run Method Display>> " + i);

        }
    }


    public static void main(String[] args) {
        FirstSteps fs = new FirstSteps();
        Thread th = new FirstSteps();
        th.run();
        //Main method display
        System.out.println("Main method Display");
        for (int i = 1; i < 2100; i++) {
            System.out.println("Main Method Display>> " + i);
        }

    }
}
