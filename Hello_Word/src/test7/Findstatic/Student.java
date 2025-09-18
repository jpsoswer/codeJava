package test7.Findstatic;

public class Student {
    public String name;
    public String age;
    public static String teacher;

    public Student() {
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static String getTeacher() {
        return teacher;
    }

    public static void setTeacher(String teacher) {
        Student.teacher = teacher;
    }
    public void show()
    {
        System.out.println(name+ ", " +age +", " + teacher);
    }
}
