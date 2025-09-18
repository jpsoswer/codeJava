package test20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class randomName70 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1);
        Collections.addAll(list,0,0,0);
        //打乱集合中的数据
        Collections.shuffle(list);
        //创建随机数，随即选择
        Random rand = new Random();
        int n = rand.nextInt(list.size());
        //创建男生女生的集合
        ArrayList<String> boylist = new ArrayList<>();
        ArrayList<String> girllist = new ArrayList<>();
        Collections.addAll(boylist,"石昊","罗峰","霍雨浩","陈平安","白小纯","王林","叶凡","龙浩晨","萧炎","唐三");
        Collections.addAll(girllist,"清漪","宁姚","萧熏儿","徐欣");
        if(n==1)
        {
            //在男生中随机
            int boyIndex = rand.nextInt(boylist.size());
            String boyName = boylist.get(boyIndex);
            System.out.println(boyName);
        }
        else{
            //在女生中随机
            int girlIndex = rand.nextInt(girllist.size());
            String girlName = girllist.get(girlIndex);
            System.out.println(girlName);
        }

    }
}
