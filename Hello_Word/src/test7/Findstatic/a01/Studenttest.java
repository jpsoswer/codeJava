package test7.Findstatic.a01;

import java.util.ArrayList;

public class Studenttest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("zhangsan",23,"男");
        Student s2 = new Student("lisi",24,"女");
        Student s3 = new Student("wangwu",25,"男");
        //把每个对象交给集合
        list.add(s1);
        list.add(s2);
        list.add(s3);
        int max = StudentUtil.maxStudentAge(list);
        System.out.println(max);
    }
}
