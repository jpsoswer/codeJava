package test20;


import java.util.TreeMap;

public class tm1 {
    public static void main(String[] args) {
        TreeMap<Student,String> tm = new TreeMap<>();
        Student student1 = new Student("zhangsan",23);
        Student student2 = new Student("lisi",24);
        Student student3 = new Student("wangwu",25);
        Student student4 = new Student("zhaoliu",23);
        tm.put(student1,"北京");
        tm.put(student2,"济南");
        tm.put(student3,"天津");
        tm.put(student4,"山海");
        System.out.println(tm);
    }
}
