package classDemo1;

import java.lang.reflect.Constructor;

public class class2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        //创建字节码对象
        Class aClass = Class.forName("classDemo1.student");

        //获取构造方法
        Constructor[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        Constructor declaredConstructor = aClass.getDeclaredConstructor(String.class);
        Constructor declaredConstructor1 = aClass.getDeclaredConstructor(String.class, String.class, int.class);
        //获取无参构造方法修饰符
        int modifiers = aClass.getModifiers();
        int modifiers1 = declaredConstructor.getModifiers();
        int modifiers2 = declaredConstructor1.getModifiers();
        System.out.println(modifiers2);
    }
}
