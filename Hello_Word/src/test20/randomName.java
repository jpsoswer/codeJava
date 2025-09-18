package test20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class randomName {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"石昊","罗峰","霍雨浩","陈平安","白小纯","王林","叶凡","龙浩晨","萧炎","唐三");
//        Random rm = new Random();
//        int n = rm.nextInt(list.size());
//        System.out.println(list.get(n));
        //打乱集合
        Collections.shuffle(list);
        String s = list.get(0);
        System.out.println(s);
    }
}
