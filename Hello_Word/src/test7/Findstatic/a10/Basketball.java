package test7.Findstatic.a10;

public class Basketball extends Person{
    public Basketball() {
    }

    public Basketball(String name, int age) {
        super(name, age);
    }

    @Override
    public void Play() {
        System.out.println("学打篮球");
    }
}
