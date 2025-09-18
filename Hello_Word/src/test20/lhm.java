package test20;

import java.util.LinkedHashMap;

public class lhm {
    //LinkedHashMap特点：有序，不重复，无索引；
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lm = new LinkedHashMap<>();
        lm.put("a",123);
        lm.put("b",345);
        lm.put("c",789);
        System.out.println(lm);
    }
}
