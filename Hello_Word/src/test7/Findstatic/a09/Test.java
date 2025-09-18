package test7.Findstatic.a09;

public class Test {
    public static void main(String[] args) {
        Flog fl = new Flog();
        fl.setName("小宝");
        fl.setAge(1);
        System.out.println(fl.getName() + ", " + fl.getAge());
        fl.eat();
        fl.swim();
        Rabbit rb = new Rabbit();
        rb.setName("小白");
        rb.setAge(2);
        System.out.println(rb.getName() + ", " +rb.getAge());
        rb.eat();
    }
}
