package test7.Findstatic.a10;

public class BasketballTeacher extends Person{
    public BasketballTeacher() {
    }

    public BasketballTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void Play() {
        System.out.println("教打篮球");
    }
}
