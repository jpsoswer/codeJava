package test14;

import java.util.*;

public class test02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =  scan.nextInt();
        HashMap<Integer,Integer>  hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int number = scan.nextInt();
            if(hm.containsKey(number))
            {
                hm.put(number,hm.get(number)+1);
            }
            else {
                hm.put(number,1);
            }
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> es : hm.entrySet()) {
            Integer value = es.getValue();
            if(value>max)
            {
                max = value;
            }
        }
        ArrayList<Integer> arrl =  new ArrayList<>();
        for (Map.Entry<Integer, Integer> es : hm.entrySet()) {
            if(es.getValue() == max)
            {
                arrl.add(es.getKey());
            }
        }
        Collections.sort(arrl);
        for (Integer i : arrl) {
            System.out.println(i);
        }
    }
}
