package CJPractice.StacksAndQueues.Stacks.CR;

public class Stack_Custom {
    int[] arr;
    int tos;

    public Stack_Custom() {
        arr = new int[5];
        tos = -1;

    }

    public boolean isFull() {
        return size() == arr.length;
    }

    public int size() {
        return tos + 1;
    }

    public boolean isEmpty() {
        return size() == 0 ? true : false;
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[tos];
        }
        return -1;
    }

    public void push(int ele) {
        if (isFull()) {
            throw new RuntimeException("Stack is Full !!");
        }
        tos++;
        arr[tos] = ele;
    }

    public void disp() {
        for (int i = tos; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pop Failed , Stack is Empoty !");
        }
        int ele = arr[tos];
        tos--;
        return ele;
    }


}

class Stack_Custom_dynamic extends Stack_Custom {

    public void push(int ele) {
        if (isFull()) {

            //Expand the array
            int[] arr1 = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                arr1[i] = arr[i];
            }
            arr = arr1;
            System.out.println("Stack Expanded ==> Old Length >> " + arr.length + " New Length >> " + arr1.length);
        }
        tos++;

        arr[tos] = ele;

    }


}

class client {
    public static void main(String[] args) {
        Stack_Custom_dynamic stk = new Stack_Custom_dynamic();
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        stk.push(60);
        stk.push(70);
        stk.push(80);

        stk.disp();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(stk.pop());
//        }
    }
}
