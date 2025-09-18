package test20;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class tm2 {
    public static void main(String[] args) {
        String s = "abaacdbbffsadafdxcz";
        TreeMap<Character,Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c))
            {
                //集合中有
                int count=map.get(c);
                map.put(c,count+1);
            }
            else{
                //集合中没有
                map.put(c,1);
            }

        }
        StringBuilder sb = new StringBuilder();
        map.forEach((Character key, Integer value)-> sb.append(key).append("(").append(value).append(")").append(" "));
        System.out.println(sb);
    }
}
