package test16;

import java.util.Iterator;
import java.util.TreeSet;

public class test01 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(8);
        ts.add(4);
        ts.add(5);
        ts.add(3);
        System.out.println(ts);
        System.out.println("-----------------");
        Iterator it = ts.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("-----------------");
        for(int x:ts)
        {
            System.out.println(x);
        }
        System.out.println("-----------------");
        ts.forEach(i->System.out.println(i));
        System.out.println("-----------------");
    }
}
