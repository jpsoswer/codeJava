package proticecode_2024_09_18;
class Listone{
    public int kind;
    public Listone next;
    public Listone(int kind,Listone next)
    {
        this.kind = kind;
        this.next = next;
    }
    public static Listone He(Listone h1,Listone n1)
    {
        if(h1 == null || n1 == null)
        {
            return h1 == null ? n1 : h1;
        }
        Listone head = h1.kind <= n1.kind ? h1 : n1;
        Listone ctr1 = head.next;
        Listone ctr2 = head == h1 ? n1 : h1;
        Listone pre = head;
        while(ctr1 != null && ctr2 != null)
        {
            if(ctr1.kind <= ctr2.kind)
            {
                pre.next = ctr1;
                ctr1 = ctr1.next;
            }
            else
            {
                pre.next = ctr2;
                ctr2 = ctr2.next;
            }
            pre = pre.next;
        }
        pre.next = ctr1 != null ? ctr1 : ctr2;
        return head;
    }
    public static void printlist(Listone head)
    {
        while(head != null)
        {
            System.out.println(head.kind);
            head = head.next;
        }
    }
}
public class TwoList {
    public static void main(String[] args) {
        Listone h1 = new Listone(3,null);
        Listone h2 = new Listone(7,null);
        Listone h3 = new Listone(9,null);
        Listone h4 = new Listone(11,null);
        Listone h5 = new Listone(15,null);
        Listone n1 = new Listone(2,null);
        Listone n2 = new Listone(6,null);
        Listone n3 = new Listone(10,null);
        Listone n4 = new Listone(13,null);
        Listone n5 = new Listone(16,null);
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        h4.next = h5;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        h1 = Listone.He(h1,n1);
        Listone.printlist(h1);
    }
}
