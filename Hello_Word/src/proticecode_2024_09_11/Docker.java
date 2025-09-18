package proticecode_2024_09_11;

import java.util.ArrayList;
import java.util.HashSet;

public class Docker {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        HashSet<String> s = new HashSet<String>();
        a.add("first");
        a.add("thend");
        a.add("first");
        s.add("first");
        s.add("thend");
        s.add("first");
        System.out.println(a);
        System.out.println("------------------");
        System.out.println(s);
    }
}
