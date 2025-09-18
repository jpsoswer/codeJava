package test10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class mapH1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //声明一个HashMap对象
        Map<Integer, Integer> map = new HashMap<>();
        //第二个位置存放相同的数的个数
        for(int i=0;i<n;i++)
        {
            int a = scanner.nextInt();
            map.put(a, map.getOrDefault(a, 0)+1);

        }
        //创建一个最大值变量，用以存放数量最多的数
        int max = 0;
        //增强for循环求出最大的数
        for(Entry entry: map.entrySet())
        {
            max = Math.max(max, (int) entry.getValue());
        }
        //创建集合
        List<Integer> list = new ArrayList<>();
        for(Entry entry: map.entrySet())
        {
            //将Map中的键值存放在ArrayList当中
            if((int)entry.getValue() == max)
            {
                list.add((Integer) entry.getKey());
            }
        }
        //集合排序（从小到大）
        Collections.sort(list);
        for(int list2: list)
        {
            System.out.print(list2 + " ");
        }
    }
}
