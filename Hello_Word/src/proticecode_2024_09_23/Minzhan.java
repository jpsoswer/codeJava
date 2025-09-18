package proticecode_2024_09_23;

import java.util.Stack;

class Min{
    Stack<Integer> yuan;
    Stack<Integer>min;
    public Min()
    {
        yuan = new Stack<Integer>();
        min = new Stack<Integer>();
    }
    public void Minzn(int val)
    {
        yuan.push(val);
        if(min.isEmpty() || val <= min.peek())
        {
            min.push(val);
        }
        else{
            min.push(min.peek());
        }
    }
    public void getPop()
    {
        yuan.pop();
        min.pop();
    }
    public int getPeek()
    {
        return yuan.peek();
    }
    public int Minpeek()
    {
        return min.peek();
    }
}
public class Minzhan {
    public static void main(String[] args) {
        Min se = new Min();
        se.Minzn(2);
        se.Minzn(3);
        se.Minzn(1);
        se.Minzn(4);
        se.Minzn(3);
        int index = se.Minpeek();
        System.out.println(index);
    }
}
