package proticecode_2024_0920;
class Duifirst{
    public int[] purpue;
    public int l;
    public int r;
    public Duifirst(int n)
    {
        purpue = new int[n];
        l = 0;
        r = 0;
    }
    public boolean panduan()
    {
        return l == r;
    }
    public void jia(int val)
    {
        purpue[r++] = val;
    }
    public int chu()
    {
        return purpue[l++];
    }
    public int head()
    {
        return purpue[l];
    }
    public int sex()
    {
        return r-l;
    }
    public int[] print()
    {
        return purpue;
    }
}
public class Duilist {
    public static void main(String[] args) {
        Duifirst l1 = new Duifirst(30);
        l1.jia(10);
        l1.jia(3);
        l1.jia(15);
        l1.jia(25);
        l1.jia(17);
//        int[] list = l1.print();
//        for(int s: list)
//        {
//            System.out.println(s);
//        }
        for(int i=0;i<3;i++)
        {
            System.out.println(l1.chu());
        }
    }
}
