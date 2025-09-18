package test7.Findstatic.a08;
//青蛙类
public class frog extends Animal {

    public frog() {
    }

    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("吃虫子");
    }
}
