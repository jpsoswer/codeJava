package day2025_1_2;

public abstract class Animal {
    private String name;
    private int hight;

    public Animal() {
    }

    public Animal(String name, int hight) {
        this.name = name;
        this.hight = hight;
    }

    public void getName() {
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getHight() {
        System.out.println(hight);
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
    public abstract void eat();
    public abstract void jiaosheng();

    public void foot()
    {
        System.out.println("四条腿走路");
    }
}