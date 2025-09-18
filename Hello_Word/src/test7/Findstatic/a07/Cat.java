package test7.Findstatic.a07;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String someting)
    {
        System.out.println(getAge() + "岁的"+getColor()+"的猫咪眯着眼睛侧着头吃" + someting);
    }
    public void catchMouse()
    {
        System.out.println("在逮老鼠");
    }
}
