package test7.Findstatic.a07;

public class Animal {
    private int Age;
    private String color;

    public Animal() {
    }

    public Animal(int age, String color) {
        Age = age;
        this.color = color;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void eat(String someting)
    {
        System.out.println("动物正在吃东西");
    }
}
