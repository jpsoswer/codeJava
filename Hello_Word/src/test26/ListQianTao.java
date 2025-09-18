package test26;

import java.util.*;

public class ListQianTao {
    public static void main(String[] args) {
        //创建一个集合来存储数据
        HashMap<String, ArrayList<String>> hs = new HashMap<>();
        //创建三个单列集合来存储嵌套数据
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("中国");
        al1.add("日本");
        al1.add("韩国");
        al1.add("朝鲜");
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("英国");
        al2.add("法国");
        al2.add("德国");
        al2.add("波兰");
        ArrayList<String> al3 = new ArrayList<>();
        al3.add("美国");
        al3.add("加拿大");
        al3.add("墨西哥");
        al3.add("巴西");
        //添加hashmap集合对象
        hs.put("亚洲",al1);
        hs.put("欧洲",al2);
        hs.put("美洲",al3);
        //获取entry对象获取键值与数据
        Set<Map.Entry<String, ArrayList<String>>> entries = hs.entrySet();
        //循环遍历
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            StringJoiner sj = new StringJoiner(", ","","");
            ArrayList<String> alt = entry.getValue();
            for (String s : alt) {
                sj.add(s);
            }
            System.out.println(key+" = "+sj);
        }

    }
}
