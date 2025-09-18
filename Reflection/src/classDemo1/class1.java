package classDemo1;

public class class1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class aClass = Class.forName("classDemo1.student");
        Class studentClass = student.class;

        student st = new student();
        Class aClass1 = st.getClass();
        System.out.println(aClass1);
    }
}
