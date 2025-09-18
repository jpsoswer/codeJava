package test7.Findstatic.a09;

public class  Flog extends Animal implements Swim {
    public Flog() {
    }

    public Flog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("蛙泳");
    }
}
