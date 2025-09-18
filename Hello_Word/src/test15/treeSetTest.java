package test15;

import java.util.TreeSet;

public class treeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(1);
        ts.add(2);
        ts.add(123);
        ts.add(34);
        ts.add(12);
        System.out.println(ts);
    }
}
