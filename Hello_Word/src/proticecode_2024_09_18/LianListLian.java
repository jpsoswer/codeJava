package proticecode_2024_09_18;
class LiianList{
    public int sum;
    public LiianList next;
    public LiianList(int sum,LiianList next)
    {
        this.sum = sum;
    }
    public void printlist(LiianList head)
    {
        LiianList stu = head;
        while(stu != null)
        {
            System.out.println(stu.sum);
            stu = stu.next;
        }
    }
    public static LiianList fan(LiianList head)
    {
        LiianList pre = null;
        LiianList next = null;
        while(head != null)
        {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
public class LianListLian {
    public static void main(String[] args) {
        LiianList head = new LiianList(0,null);
       LiianList stu1 = new LiianList(13,null);
        LiianList stu2 = new LiianList(15,null);
        LiianList stu3 = new LiianList(1,null);
        LiianList stu4 = new LiianList(113,null);
        LiianList stu5 = new LiianList(139,null);
        head.next = stu1;
        stu1.next = stu2;
        stu2.next = stu3;
        stu3.next = stu4;
        stu4.next = stu5;
        head = LiianList.fan(head.next);
        head.printlist(head);

    }
}
