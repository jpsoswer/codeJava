package test20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class randomNotReport {
    public static void main(String[] args) {
        //创建一个集合存储名字
        ArrayList<String> list = new ArrayList<>();
        //创建一个新的集合，为新的一轮做准备
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list,"石昊","罗峰","霍雨浩","陈平安","白小纯","王林","叶凡","龙浩晨","萧炎","唐三");
        Random rand = new Random();
        for (int i = 1; i <= 5; i++) {
            System.out.println("---------第"+i+"次选人---------");
            int n = list.size();
            //不重复
            for (int j = 0; j < n; j++) {
                int index = rand.nextInt(list.size());
                String name = list.remove(index);
                list1.add(name);
                System.out.println(name);
            }
            list.addAll(list1);
            list1.clear();
        }
            }
}
