package test20;

import java.util.Comparator;
import java.util.TreeMap;

public class tm {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        map.put(1,"雷碧");
        map.put(2,"美月达");
        map.put(3,"康失夫");
        map.put(4,"洽口卡乐");
        map.put(5,"芳达");
        System.out.println(map);
    }
}
