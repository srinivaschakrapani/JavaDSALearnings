package CJPractice.HashMap.CR;

import java.util.HashMap;

public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap();
        hm.put("A", 1);
        hm.put("AXS", 2);
        hm.put("BGX", 3);
        hm.put("zzs", 4);
        hm.put("RET", 5);
        hm.put("bgv", 6);
        System.out.println(hm);
        hm.remove("A");
        System.out.println(hm);
        System.out.println(hm.get("B"));

        System.out.println(hm.keySet());
        for (String x : hm.keySet()) {
            System.out.println(x + "< == >" + hm.get(x));
        }


    }

}
