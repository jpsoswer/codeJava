package test14;

public class BoSiCat extends Cat{
    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getName()+"在吃鱼，并在捉老鼠");
    }
}
