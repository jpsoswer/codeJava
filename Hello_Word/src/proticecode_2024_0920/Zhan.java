package proticecode_2024_0920;
class Zhanfirst{
    public int[] zhan;
    public int up;
    public Zhanfirst(int n)
    {
        zhan = new int[n];
        up = 0;
    }
    public void jie(int n)
    {
        zhan[up++] = n;
    }
    public int tan()
    {
        return zhan[--up];
    }
    public int ding()
    {
        return zhan[up-1];
    }
    public int sex()
    {
        return up-1;
    }
    public int[] print()
    {
        return zhan;
    }
}
public class Zhan {
    public static void main(String[] args) {
        Zhanfirst list = new Zhanfirst(30);
        list.jie(5);
        list.jie(3);
        list.jie(4);
        list.jie(2);
        list.jie(1);
        list.tan();
        list.tan();
        list.jie(50);
        list.jie(13);
        int n = list.sex();
        for(int i=0;i<=n;i++)
        {
            System.out.print(list.tan() + "   ");
        }
    }
}
