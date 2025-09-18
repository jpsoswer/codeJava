package test7.Findstatic.a07;

public class Person {
    private String name;
    private int age;

    public Person() {
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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //养狗
//    public void keepPet(Dog dog,String something)
//    {
//        System.out.println("年龄为"+getAge()+"岁的"+getName()+"养了一只"+dog.getColor()+"的"+dog.getAge()+"岁的狗");
//        dog.eat(something);
//    }
//    //养猫
//    public void keepPet1(Cat cat,String something)
//    {
//        System.out.println("年龄为"+getAge()+"岁的"+getName()+"养了一只"+cat.getColor()+"的"+cat.getAge()+"岁的猫");
//        cat.eat(something);
//    }
    //多态
    public void keepPet2(Animal a,String something)
    {
        System.out.println("年龄为"+getAge()+"岁的"+getName()+"养了一只"+a.getColor()+"的"+a.getAge()+"岁的动物");
        //狗
        if(a instanceof Dog)
        {
            Dog d = (Dog)a;
            d.eat(something);
            d.lookHome();
        }
        //猫
        if(a instanceof Cat)
        {
            Cat c = (Cat) a;
            c.eat(something);
            c.catchMouse();
        }
    }
}
