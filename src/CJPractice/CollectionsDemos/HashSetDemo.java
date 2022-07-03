package CJPractice.CollectionsDemos;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(2);
        System.out.println((hs.add(new A(4,3))));
        /*
        1. compare the hascode of the two objects , if false store else go to step 2
        2. compare references using == method , if false store directly , else go to step 3
        3. compare this.equals(that) if false , store else do not put it in hashset.
         */
        System.out.println((hs.add(new A(4,3))));

        var a1 =new A(4,3);
        System.out.println(hs.add(a1));
        System.out.println( hs.add(a1));
        System.out.println(hs);
    }


}


class  A {
    private int x ;
    private int y;
    A(int x , int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
       return this.x + this.y;
    }
}