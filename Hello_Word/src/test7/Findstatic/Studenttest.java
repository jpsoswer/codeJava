package test7.Findstatic;

public class Studenttest {
    public static void main(String[] args) {
        Student.teacher = "阿伟老师";
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge("男");
        s1.show();
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge("男");
        s2.show();
    }
}
