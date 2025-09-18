package test9;
import java.util.Scanner;
public class SystemZhiTest {
    public static void main(String[] args) {
        //开始
        long open = System.currentTimeMillis();
        for(int i=2;i<1000;i++)
        {
            boolean tf = Zhione(i);
            if(tf)
            {
                System.out.println(i);
            }
        }
        //结束
        long end = System.currentTimeMillis();   //1730351470539          1730351491688
        System.out.println(open);
        System.out.println(end);

    }
    //第一种方法
    public static boolean Zhi(int number)
    {
        for (int i = 2; i < number; i++) {
            if(number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    //第二种方法
    public static boolean Zhione(int number)
    {
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number % i == 0)
            {
                return false;
            }
        }
        return true;
    }

}
