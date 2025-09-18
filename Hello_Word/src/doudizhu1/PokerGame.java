package doudizhu1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class PokerGame {
    //创建牌盒
    static ArrayList<String> list = new ArrayList<>();
    //创建map集合存储数据以及对应价值
    static HashMap<String,Integer> hm = new HashMap<>();
    //创建静态代码块
    static {
        //创建牌组
        String[] color = {"♦","♣","♥","♠"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //创建for循环将数组元素存放到牌盒当中
        for (String c : color) {
            for (String n : number) {
                list.add(c+n);
            }
        }
        list.add(" 小王");
        list.add(" 大王");
        //为map集合添加元素以及价值
        hm.put("J",11);
        hm.put("Q",12);
        hm.put("K",13);
        hm.put("A",14);
        hm.put("2",15);
        hm.put("小王",50);
        hm.put("大王",100);
    }
    //创建入口无参构造
    public PokerGame()
    {
        //打乱数据
        Collections.shuffle(list);
        //分配牌组
        ArrayList<String> dipai = new ArrayList<>();
        ArrayList<String> poker1 = new ArrayList<>();
        ArrayList<String> poker2 = new ArrayList<>();
        ArrayList<String> poker3 = new ArrayList<>();
        //开始分配
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if(i<=2)
            {
                dipai.add(poker);
                continue;
            }
            if(i%3==0)
            {
                poker1.add(poker);
            } else if (i%2==0) {
                poker2.add(poker);
            }else {
                poker3.add(poker);
            }
        }
        //排序
        order(dipai);
        order(poker1);
        order(poker2);
        order(poker3);
        //看牌
        lookpoker("底牌",dipai);
        lookpoker("李吧皮",poker1);
        lookpoker("韩服人",poker2);
        lookpoker("天惨叫",poker3);
        //System.out.println(list);
    }

    //排序
    public static void order(ArrayList<String> pokers)
    {
        //创建自定义排序
        Collections.sort(pokers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //获得o1的花色
                String c1 = o1.substring(0,1);
                //获得o1的价值
                int value1 = getValue(o1);
                //获得o2的花色
                String c2 = o2.substring(0,1);
                //获得o1的价值
                int value2 = getValue(o2);
                int i = value1 - value2;
                return i==0 ? c1.compareTo(c2) : i;
            }
        });
    }

    //获得价值
    public static int getValue(String poker)
    {
        //获得牌数
        String number = poker.substring(1);
        //判断看是否在map集合中有
        if(hm.containsKey(number))
        {
            return hm.get(number);
        }
        else {
            return Integer.parseInt(number);
        }
    }
    //看牌逻辑
    public static void lookpoker(String name,ArrayList<String> pokers)
    {
        System.out.print(name+": ");
        for (String poker : pokers) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}