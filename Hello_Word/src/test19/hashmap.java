package test19;

import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        String[] s={"A","B","C","D"};
        List<String> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int index=r.nextInt(s.length);
            list.add(s[index]);
        }
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<list.size();i++)
        {
            if(map.containsKey(list.get(i)))
            {
                int count=map.get(list.get(i));
                map.put(list.get(i),count+1);
            }
            else{
                map.put(list.get(i),1);
            }
        }
        Set<Map.Entry<String, Integer>> et = map.entrySet();
        int max=0;
        for (Map.Entry<String, Integer> st : et) {
            if(st.getValue()>max)
            {
                max=st.getValue();
            }
        }
        System.out.println(map);
        System.out.println(max);
        for (Map.Entry<String, Integer> st : et) {
            if(st.getValue()==max)
            {
                System.out.println(st.getKey());
            }
        }

    }
}
