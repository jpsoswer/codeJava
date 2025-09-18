package threadyed;

public class threadDemo2 {
    public static void main(String[] args) {
        myThrad2 mt1 = new myThrad2();
        myThrad2 mt2 = new myThrad2();
        myThrad2 mt3 = new myThrad2();
        mt1.setName("1号");
        mt2.setName("2号");
        mt3.setName("3号");
        mt1.start();
        mt2.start();
        mt3.start();
    }
}
