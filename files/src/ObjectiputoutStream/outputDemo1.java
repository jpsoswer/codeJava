package ObjectiputoutStream;

import java.io.*;
import java.util.ArrayList;

public class outputDemo1 {
    public static void main(String[] args) throws IOException {
        //创建对象
        Student st1 = new Student("张三",23,"山东");
        Student st2 = new Student("李四",24,"山东");
        Student st3 = new Student("王五",25,"南京");
        Student st4 = new Student("赵六",26,"上海");
        //创建集合存储对象
        ArrayList<Student> st = new ArrayList<>();
        st.add(st1);
        st.add(st2);
        st.add(st3);
        st.add(st4);
        //创建序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\b.txt"));
        oos.writeObject(st);

        //关流
        oos.close();
    }
}
