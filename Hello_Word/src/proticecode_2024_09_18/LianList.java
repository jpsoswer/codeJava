package proticecode_2024_09_18;
class Node{
    public int sum = 0;
    public Node next;
    public Node(int sum)
    {
        this.sum = sum;
        this.next=null;
    }
    public void Listplay(Node head)
    {
        Node cur = head.next;
        while(cur != null)
        {

            System.out.println(cur.sum);
            cur = cur.next;
        }
    }
}
public class LianList {
    public static void main(String[] args) {
        Node head = new  Node(0);
        Node sum1 = new Node(12);
        Node sum2 = new Node(1);
        Node sum3 = new Node(123);
        Node sum4 = new Node(15);
        Node sum5 = new Node(17);
        sum1.next = sum2;
        sum2.next = sum3;
        sum3.next = sum4;
        sum4.next = sum5;
        head.next=sum1;
        head.Listplay(head);
    }
}
