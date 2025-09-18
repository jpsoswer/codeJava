package proticecode_2024_09_19;

import java.util.ArrayList;

class Dog{
    public String name;
    public int age;
    ArrayList dog = new ArrayList();
    public Dog(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public void Print()
    {
        System.out.println();
    }

}
public class DogList {
    public static void main(String[] args) {
        Dog dog1 = new Dog("小黑",3);
        Dog dog2 = new Dog("大黄",13);
        Dog dog3 = new Dog("小白",40);
    }
}
