package StringDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        Integer[] arr = {2,1,74,43,14,9,27};
        List<Integer> se = new ArrayList<>(Arrays.asList(arr));
        List<Integer> sa = new ArrayList<>(Arrays.asList(new Integer[] {1,32,45,6,6,7}));
        se.addAll(sa);
        Collections.sort(se);
        for(int s: se)
        {
            System.out.println(s);
        }
    }
}
