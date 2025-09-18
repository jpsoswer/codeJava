package test10;
import java.util.*;
public class ArayList {
    public static void main(String[] args) {
         List<Integer> list= selfDividingNumbers(1,22);
        System.out.println(list.toString());
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> List = new ArrayList<>();
        for(int i = left;i<=right;i++)
        {
            List.add(shuwei(i));
        }
        return List;
    }
    public static Integer shuwei(int n)
    {
        String s = n+"";
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            int a = s.charAt(i)-'0';
            if(n%a == 0)
            {
                count++;
            }
        }
        if(count == s.length())
        {
            return n;
        }
        return -1;
    }
}
