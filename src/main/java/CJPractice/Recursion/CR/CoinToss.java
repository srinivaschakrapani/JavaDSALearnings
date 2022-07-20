package CJPractice.Recursion.CR;

public class CoinToss {
    public static void main(String[] args) {
        tossCoin(1,"");
        System.out.println("===================");
        tossCoin(2,"");
        System.out.println("===================");
        tossCoin(5,"");
        System.out.println("===================");

    }

    public static void tossCoin(int no_of_coins, String path){
        if(no_of_coins == 0){
            System.out.println(path);
            return;
        }
        tossCoin(no_of_coins -1, path+"H");
        tossCoin(no_of_coins -1, path+"T");
    }
}
