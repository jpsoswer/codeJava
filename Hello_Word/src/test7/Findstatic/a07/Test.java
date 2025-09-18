package test7.Findstatic.a07;

public class Test {
    public static void main(String[] args) {
        //狗
        Person pe = new Person("张三",38);
        Dog d = new Dog(3,"黄色");
        pe.keepPet2(d,"骨头");
        //猫
        Person pe1 = new Person("李四",30);
        Cat c = new Cat(2,"灰色");
        pe1.keepPet2(c,"小鱼干");
    }
}
