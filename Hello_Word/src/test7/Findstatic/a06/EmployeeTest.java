package test7.Findstatic.a06;

public class EmployeeTest {
    public static void main(String[] args) {
        Lecturer le = new Lecturer();
        le.setId("12345");
        le.setName("张三");
        System.out.println(le.getId() + ", " +le.getName());
        le.work();
        System.out.println("------------------------------");
        Tutor tu  = new Tutor();
        tu.setId("123");
        tu.setName("李四");
        System.out.println(tu.getId() + ", " + tu.getName());
        tu.work();
    }
}
