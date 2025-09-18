package proticecode_2024_09_19;
class ListNode{
    public int index;
    public ListNode next;
    public ListNode(int index)
    {
        this.index = index;
        this.next = null;
    }
    public static ListNode Sum(ListNode l1,ListNode h1)
    {
        ListNode ctr = null;
        ListNode atu = null;
        int carry = 0;
        for(int sum,yv;l1 != null || h1 != null; l1 = l1 == null ? null : l1.next,h1 = h1 == null ? null :h1.next)
        {
            sum = (l1 == null ? 0 : l1.index) + (h1 == null ? 0 : h1.index) +carry;
            yv = sum%10;
            carry = sum/10;
            if(atu == null)
            {
                atu = new ListNode(yv);
                ctr = atu;
            }
            else
            {
                ctr.next = new ListNode(yv);
                ctr = ctr.next;
            }
        }
        if(carry == 1)
        {
            ctr.next = new ListNode(1);
        }
        return atu;
    }
    public void print(ListNode list1)
    {
        while(list1 != null)
        {
            System.out.print(list1.index);
            list1 = list1.next;
        }
    }
}
public class SumList {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(6);
        ListNode l3 = new ListNode(8);
        ListNode l4 = new ListNode(4);
        ListNode h1 = new ListNode(5);
        ListNode h2 = new ListNode(6);
        ListNode h3 = new ListNode(3);
        ListNode h4 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        h1.next = h2;
        h2.next = h3;
        h3.next = h4;
        ListNode head;
        head = ListNode.Sum(l1,h1);
        l1.print(head);
    }
}
