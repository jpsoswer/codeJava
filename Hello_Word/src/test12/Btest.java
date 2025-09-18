package test12;

public class Btest {
    private String name;
    private int age;
    private double hight;

    public Btest(String name, int age, double hight) {
        this.name = name;
        this.age = age;
        this.hight = hight;
    }

    public Btest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
}
