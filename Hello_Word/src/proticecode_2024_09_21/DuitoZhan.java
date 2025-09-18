package proticecode_2024_09_21;

import java.util.LinkedList;
import java.util.Queue;

class Duitwo{
    public Queue<Integer> in;
    public Duitwo()
    {
        in = new LinkedList<Integer>();
    }
    public void push(int x)
    {
        int n = in.size();
        in.offer(x);
        for(int i =0 ;i<n;i++)
        {
            in.offer(in.poll());
        }
    }
    public void printtwo()
    {
        int[] arr = new int[in.size()];
        int index = 0;
        while(!in.isEmpty())
        {
            arr[index++] = in.poll();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
public class DuitoZhan {
    public static void main(String[] args) {
        Duitwo su = new Duitwo();
        su.push(12);
        su.push(5);
        su.push(13);
        su.push(27);
        su.push(100);
        su.printtwo();
    }
}
