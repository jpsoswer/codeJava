package test3;
//用集合打印学生信息
import java.util.ArrayList;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张三",16);
        Student s2 = new Student("李四",10);
        Student s3 = new Student("王五",19);
        Student s4 = new Student("赵二",46);
        Student s5 = new Student("二狗子",146);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i).getName() + " ," + list.get(i).getAge());
        }
    }
}
