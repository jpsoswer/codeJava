package test18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class test1 {
    public static void main(String[] args) {
        Map<Student,String> mp = new HashMap<>();
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",24);
        Student stu3 = new Student("王五",25);
        Student stu4 = new Student("赵六",26);
        mp.put(stu1,"山东");
        mp.put(stu2,"北京");
        mp.put(stu3,"广州");
        mp.put(stu4,"天津");
        Set<Student> st = mp.keySet();
        for (Student s:st)
        {
            String values=mp.get(s);
            System.out.println(s+"="+values);
        }
        System.out.println("-------------------------");

        Set<Map.Entry<Student, String>> entries = mp.entrySet();
        for (Map.Entry<Student, String> en : entries) {
            String ke = en.getKey().toString();
            String va=en.getValue();
            System.out.println(ke+"=="+va);
        }
        System.out.println("------------------------");
        mp.forEach((Student student, String s)-> System.out.println(student+"="+s));

    }
}
