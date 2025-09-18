package test15;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetTest {
    public static void main(String[] args) {
        Student st1 = new Student("zhangsan",23);
        Student st2 = new Student("lisi",24);
        Student st3 = new Student("wangwu",25);
        Student st4 = new Student("zhangsan",23);

        HashSet<Student> hs = new HashSet<>();
        hs.add(st1);
        hs.add(st2);
        hs.add(st3);
        hs.add(st4);

        Iterator<Student> it = hs.iterator();
        while(it.hasNext())
        {
            Student st = it.next();
            System.out.println(st);
        }
        //System.out.println(hs);
    }
}
