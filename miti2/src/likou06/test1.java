package likou06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(5);
        HashSet<Integer> hs = new HashSet<>(list);
        for (Integer h : hs) {
            System.out.println(h);
        }
    }
}
