package test14;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Animal hashiqi = new HashiQiDog();
        hashiqi.setAge(4);
        hashiqi.setName("哈士奇");
        hashiqi.eat();
        ArrayList<Animal> an = new ArrayList<>();
        ArrayList<Dog> dog = new ArrayList<>();
        ArrayList<Cat> cat = new ArrayList<>();
        ArrayList<BoSiCat> bscat = new ArrayList<>();
        keepPet(an);
        keepPet(dog);
        keepPet(cat);
        keepPet(bscat);
        Animal bosimao = new BoSiCat();
        bosimao.setAge(3);
        bosimao.setName("波斯猫");
        bosimao.eat();
    }
    public static<E> void keepPet(ArrayList<? extends Animal> list)
    {

    }
}
