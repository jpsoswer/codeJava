package test7.Findstatic.a07;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String someting)
    {
        System.out.println(getAge() + "岁的"+getColor()+"的狗两只前腿死死的抱住" + someting + "猛吃");
    }
    public void lookHome()
    {
        System.out.println("在看家");
    }
}
