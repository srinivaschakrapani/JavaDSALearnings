package CJPractice.StacksAndQueues.Queue.Practice;

import java.util.*;

class Main {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int n = scn.nextInt();

        Queue.hoodies(n);
    }
}

class Queue {

    protected int size;

    protected int front;
    protected int[] data;


    public Queue() {
        this.size = 0;
        this.front = 0;
        this.data = new int[5];
    }

    public Queue(int cap) {
        this.size = 0;
        this.front = 0;
        this.data = new int[cap];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(int item) throws Exception {
        if (this.size() == this.data.length) {
            int[] oa = this.data;
            int[] na = new int[oa.length * 2];
            for (int i = 0; i < this.size(); i++) {
                int idx = (i + front) % oa.length;
                na[i] = oa[idx];
            }

            this.data = na;
            this.front = 0;
        }

        // if (this.size == this.data.length) {
        // throw new Exception("queue is full");
        // }

        this.data[(front + size) % this.data.length] = item;
        size++;

    }

    public int dequeue() throws Exception {
        if (this.size == 0) {
            throw new Exception("queue is empty");

        }

        int rv = this.data[front];
        front = (front + 1) % this.data.length;
        size--;

        return rv;

    }

    public int getFront() throws Exception {
        if (this.size == 0) {
            throw new Exception("queue is empty");
        }

        int rv = this.data[front];

        return rv;
    }

    public void display() {
        System.out.println();
        for (int i = 0; i < size; i++) {
            int idx = (i + front) % this.data.length;
            System.out.print(this.data[idx] + " ");
        }
        System.out.print("END");
    }


    public static void hoodies(int q) throws Exception {
        // Scanner scn = new Scanner(System.in);

        // Write your Code here
        Queue q1 = null;
        Queue q2 = null;
        Queue q3 = null;
        Queue q4 = null;
        Queue courseOrderArrival = new Queue();
        boolean[] courseStudArrived = new boolean[4];
        while (q > 0) {
            q--;
            String op_type = Main.scn.next();

            if (op_type.equals("E")) {
                int q_loc = Main.scn.nextInt();
                if (!courseStudArrived[q_loc - 1]) {
                    courseOrderArrival.enqueue(q_loc);
                    courseStudArrived[q_loc - 1] = true;
                }

                if (q_loc == 1) {
                    if (q1 == null) {
                        q1 = new Queue();
                    }
                    int data = Main.scn.nextInt();
                    q1.enqueue(data);
                }
                if (q_loc == 2) {
                    if (q2 == null) {
                        q2 = new Queue();
                    }
                    int data = Main.scn.nextInt();
                    q2.enqueue(data);
                }
                if (q_loc == 3) {
                    if (q3 == null) {
                        q3 = new Queue();
                    }
                    int data = Main.scn.nextInt();
                    q3.enqueue(data);
                }
                if (q_loc == 4) {
                    if (q4 == null) {
                        q4 = new Queue();
                    }
                    int data = Main.scn.nextInt();
                    q4.enqueue(data);
                }


            } else {
                int q_loc = courseOrderArrival.getFront();
                if (q_loc == 1) {

                    if (q1 != null && !q1.isEmpty()) {
                        System.out.println("1" + " " + q1.dequeue());
                    }
                    if (q1.isEmpty()) {
                        courseOrderArrival.dequeue();
                        courseStudArrived[q_loc - 1] = false;
                    }
                } else if (q_loc == 2) {
                    if (q2 != null && !q2.isEmpty()) {
                        System.out.println("2" + " " + q2.dequeue());
                    }
                    if (q2.isEmpty()) {
                        courseOrderArrival.dequeue();
                        courseStudArrived[q_loc - 1] = false;
                    }

                } else if (q_loc == 3) {
                    if (q3 != null && !q3.isEmpty()) {
                        System.out.println("3" + " " + q3.dequeue());
                    }
                    if (q3.isEmpty()) {
                        courseOrderArrival.dequeue();
                        courseStudArrived[q_loc - 1] = false;
                    }

                } else if (q_loc == 4) {
                    if (q4 != null && !q4.isEmpty()) {
                        System.out.println("4" + " " + q4.dequeue());
                    }
                    if (q4.isEmpty()) {
                        courseOrderArrival.dequeue();
                        courseStudArrived[q_loc - 1] = false;
                    }

                }

            }
        }


    }


}

//
//import java.util.*;
//
//class Queue {
//
//    protected int size;
//
//    protected int front;
//    protected int[] data;
//
//    public Queue() {
//        this.size = 0;
//        this.front = 0;
//        this.data = new int[5];
//    }
//
//    public Queue(int cap) {
//        this.size = 0;
//        this.front = 0;
//        this.data = new int[cap];
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public boolean isEmpty() {
//        return (size == 0);
//    }
//
//    public void enqueue(int item) throws Exception {
//        if (this.size() == this.data.length) {
//            int[] oa = this.data;
//            int[] na = new int[oa.length * 2];
//            for (int i = 0; i < this.size(); i++) {
//                int idx = (i + front) % oa.length;
//                na[i] = oa[idx];
//            }
//
//            this.data = na;
//            this.front = 0;
//        }
//
//        // if (this.size == this.data.length) {
//        // throw new Exception("queue is full");
//        // }
//
//        this.data[(front + size) % this.data.length] = item;
//        size++;
//
//    }
//
//    public int dequeue() throws Exception {
//        if (this.size == 0) {
//            throw new Exception("queue is empty");
//
//        }
//
//        int rv = this.data[front];
//        front = (front + 1) % this.data.length;
//        size--;
//
//        return rv;
//
//    }
//
//    public int getFront() throws Exception {
//        if (this.size == 0) {
//            throw new Exception("queue is empty");
//        }
//
//        int rv = this.data[front];
//
//        return rv;
//    }
//
//    public void display() {
//        System.out.println();
//        for (int i = 0; i < size; i++) {
//            int idx = (i + front) % this.data.length;
//            System.out.print(this.data[idx] + " ");
//        }
//        System.out.print("END");
//    }
//
//
//    public static void hoodies(int q) throws Exception {
//
//        // Write your Code here
//        Queue q1 = null;
//        Queue q2 = null;
//        Queue q3 = null;
//        Queue q4 = null;
//        while (q > 0) {
//            q--;
//            String op_type = scn.next();
//
//            if (op_type.equals("E")) {
//                int q_loc = scn.nextInt();
//                if (q_loc == 1) {
//                    if(q1 == null){
//                        q1 = new Queue();
//                    }
//                    int data = scn.nextInt();
//                    q1.enqueue(data);
//                }
//                if (q_loc == 2) {
//                    if(q2 == null){
//                        q2 = new Queue();
//                    }
//                    int data = scn.nextInt();
//                    q2.enqueue(data);
//                }
//                if (q_loc == 3) {
//                    if(q3 == null){
//                        q3 = new Queue();
//                    }
//                    int data = scn.nextInt();
//                    q3.enqueue(data);
//                }
//                if (q_loc == 4) {
//                    if(q4 == null){
//                        q4 = new Queue();
//                    }
//                    int data = scn.nextInt();
//                    q4.enqueue(data);
//                }
//
//
//            } else {
//                if(q1!= null && !q1.isEmpty()){
//                    System.out.println("1" + " " + q1.dequeue());
//                }
//                else if(q2!= null && !q2.isEmpty()){
//                    System.out.println("2" + " " + q2.dequeue());
//                }
//                else if(q3!= null && !q3.isEmpty()){
//                    System.out.println("3" + " " + q3.dequeue());
//                }
//                else if(q4!= null && !q4.isEmpty()){
//                    System.out.println("4" + " " + q4.dequeue());
//                }
//
//            }
//        }
//
//
//    }
//
//
//    static Scanner scn = new Scanner(System.in);
//
//    public static void main(String[] args) throws Exception {
//
//        int n = scn.nextInt();
//
//        hoodies(n);
//    }
//
//}
