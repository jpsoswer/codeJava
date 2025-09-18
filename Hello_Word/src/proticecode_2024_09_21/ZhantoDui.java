package proticecode_2024_09_21;

import java.util.Stack;

class Twozhan{
    public Stack<Integer> in;
    public Stack<Integer> out;
    public Twozhan()
    {
        in = new Stack<Integer>();
        out = new Stack<Integer>();
    }
    public void zhantozhan()
    {
        if(out.empty())
        {
            while(!in.empty())
            {
                out.push(in.pop());
            }
        }
    }
    public void setin(int val)
    {
        in.push(val);
    }
    public int pop()
    {
        return out.pop();
    }
    public int peek()
    {
        return out.peek();
    }
    public void print()
    {
        int[] arr = new int[out.size()];
        int index = 0;
        while(!out.isEmpty())
        {
            arr[index++] = out.pop();
        }
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public void printone()
    {
        System.out.println(out.size());
    }
    public boolean empty()
    {
        return in.isEmpty() && out.isEmpty();
    }
}
public class ZhantoDui {
    public static void main(String[] args) {
        Twozhan se = new Twozhan();
        se.setin(10);
        se.setin(4);
        se.setin(8);
        se.setin(45);
        se.setin(15);
        se.zhantozhan();
        se.print();
    }
}
