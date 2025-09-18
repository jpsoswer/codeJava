package test14;

public class HashiQiDog extends Dog{
    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getName()+"在吃骨头，并在拆家");
    }
}
