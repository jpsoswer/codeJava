package test13;

import java.util.*;

public class foreath {
    public static void main(String[] args) {
        List<String> lsit = new ArrayList<>();
        lsit.add("zhangsan");
        lsit.add("lissi");
        lsit.add("wangwu");
//        Iterator<String> it = lsit.iterator();
//        while(it.hasNext())
//        {
//            String str = it.next();
//            if(str.equals("zhangsan"))
//            {
//                it.remove();
//            }
//        }
        ListIterator<String> stringListIterator = lsit.listIterator();
        while(stringListIterator.hasNext())
        {
            stringListIterator.add("zhangsan");
            System.out.println(stringListIterator.next());
        }
        lsit.forEach(s -> System.out.println(s));
    }
}
