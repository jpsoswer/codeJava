package proticecode_2024_09_18;
class FL{
    public int kid;
    public FL next;
    public FL(int kid,FL next)
    {
        this.kid = kid;
        this.next = next;
    }
    public  static FL Zhuan(FL head)
    {
        FL su = null;
        FL next = null;
        while(head != null)
        {
            next = head.next;
            head.next = su;
            su = head;
            head = next;
        }
        return su;
    }
    public void Printlist(FL head)
    {
        FL su = head;
        while(su != null)
        {
            System.out.println(su.kid);
            su = su.next;
        }
    }
}
public class ListFan {
    public static void main(String[] args) {
        FL num1 = new FL(12,null);
        FL num2 = new FL(4,null);
        FL num3 = new FL(6,null);
        FL num4 = new FL(26,null);
        FL num5 = new FL(9,null);
        num1.next = num2;
        num2.next = num3;
        num3.next = num4;
        num4.next = num5;
        num1 = FL.Zhuan(num1);
        num1.Printlist(num1);
    }
}
