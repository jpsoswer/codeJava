package test8.a03;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayAdd ad = new ArrayAdd();
        ad.ArrayList(1);
        ad.ArrayList(2);
        ad.ArrayList(3);
        ad.ArrayList(4);
        ad.ArrayList(5);
        for(int i=0;i<5;i++)
        {
            System.out.println(ad.getArray(i));
        }
    }
}
