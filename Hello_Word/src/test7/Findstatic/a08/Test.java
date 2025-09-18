package test7.Findstatic.a08;

public class Test {
    public static void main(String[] args) {
        //创建青蛙对象
        frog f = new frog();
        //传入数据
        f.setName("小宝");
        f.setAge(3);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.drink();
        System.out.println("-------------------------------");
        //创建狗对象
        Dog dog = new Dog();
        dog.setName("小黑");
        dog.setAge(2);
        System.out.println(dog.getName() + ", " + dog.getAge());
        dog.eat();
        dog.drink();
        System.out.println("-------------------------------");
        //创建🐏对象
        Sheep sh = new Sheep();
        sh.setName("肖恩");
        sh.setAge(4);
        System.out.println(sh.getName() + ", " + sh.getAge());
        sh.eat();
        sh.drink();
    }
}
