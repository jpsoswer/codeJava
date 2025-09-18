package proticecode_2024_0920;
class FenSun{
    public int val;
    public FenSun next;
    public FenSun(int val)
    {
        this.val = val;
        this.next = null;
    }
    public static FenSun FenSum(FenSun head,int x)
    {
        FenSun smallhead = null;
        FenSun smallwei = null;
        FenSun bighead = null;
        FenSun bigwei = null;
        FenSun next = null;
        while(head != null)
        {
            next = head.next;
            head.next = null;
            if(head.val < x)
            {
                if(smallhead == null)
                {
                    smallhead = head;
                }
                else
                {
                    smallwei.next = head;
                }
                smallwei = head;
            }
            else
            {
                if(bighead == null)
                {
                    bighead = head;
                }
                else
                {
                    bigwei.next = head;
                }
                bigwei = head;
            }
            head = next;
        }
        if(smallhead == null)
        {
            return bighead;
        }
        smallwei.next = bighead;
        return smallhead;
    }
    public void getFsum(FenSun head)
    {
        while(head != null)
        {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
public class Fenlian {
    public static void main(String[] args) {
        FenSun l1 = new FenSun(7);
        FenSun l2 = new FenSun(4);
        FenSun l3 = new FenSun(1);
        FenSun l4 = new FenSun(3);
        FenSun l5 = new FenSun(2);
        FenSun l6 = new FenSun(5);
        FenSun l7 = new FenSun(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next= l5;
        l5.next= l6;
        l6.next = l7;
        l1 = FenSun.FenSum(l1,4);
        l1.getFsum(l1);
    }
}
