package proticecode_2024_0920;
class Listxun{
    public int[] perpor;
    public int r,l,size;
    public Listxun(int n)
    {
        perpor = new int[n];
        r = l =size =0;
    }
    public void add(int val)
    {
        perpor[r++] = val;
        size++;
        if(size >= perpor.length)
        {
            r=0;
        }
    }
    public int tan()
    {
        size--;
        return perpor[l++];
    }
}
public class Xunhaundui {
    public static void main(String[] args) {
        Listxun list = new Listxun(5);
        list.add(4);
        list.add(3);
        list.add(10);
        list.add(13);
        list.add(19);
        list.add(90);
        int[] arr = list.perpor;
        for(int s: arr)
        {
            System.out.println(s);
        }
    }
}
