package classDemo2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class test1 {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        //创建学生和老师的对象
        Student stu = new Student("白小纯","男",20,"通天大陆");
        Teacher th = new Teacher("王琳",2034);
        
        wreter(stu);
    }

    private static void wreter(Object prople) throws IllegalAccessException, IOException {
        //创建字节码对象
        Class aClass = prople.getClass();

        //创建字符输出流的对象用于输出数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\com.txt"));
        //获取说有属性值
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            //暂时获取使用权限
            declaredField.setAccessible(true);
            bw.write(declaredField.getName()+"="+declaredField.get(prople));
            bw.newLine();
        }

        //关流
        bw.close();

    }
}
