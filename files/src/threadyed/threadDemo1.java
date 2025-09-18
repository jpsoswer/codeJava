package threadyed;

public class threadDemo1 {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread1 t2 = new myThread1();
        t1.setName("飞机");
        t2.setName("坦克");
        t1.start();
        t2.start();
    }
}
