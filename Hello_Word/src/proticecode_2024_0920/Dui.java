package proticecode_2024_0920;
class Duisecond{
    public int[] perpor;
    public int l;
    public int r;
    public Duisecond(int n)
    {
        perpor = new int[n];
        l = 0;
        r = 0;
    }
    public void shu(int val)
    {
        perpor[r++] = val;
    }
    public int tan()
    {
        return perpor[l++];
    }
    public int head()
    {
        return perpor[l];
    }
    public int sex()
    {
        return r-l;
    }
    public int[] print()
    {
        return perpor;
    }
}
public class Dui {
    public static void main(String[] args) {
        Duisecond l2 = new Duisecond(30);
        l2.shu(3);
        l2.shu(5);
        l2.shu(8);
        l2.shu(5);
        l2.shu(7);
        int[] list = l2.print();
        for(int s: list)
        {
            System.out.print(s + "    ");
        }
    }
}
