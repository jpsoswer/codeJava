package test7.Findstatic.a04;

import java.util.Scanner;

public class ThreeCup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入交换次数
        int n=sc.nextInt();
        //输入硬币所在的初始位置
        int Money = sc.nextInt();
        //使用循环来确定次数
        for(int i=0;i<n;i++)
        {
            //输入相互交换的两个杯子
            int x = sc.nextInt();
            int y = sc.nextInt();
            //开始判断
            if(x == Money)
            {
                Money = y;
            }
            //此处判断必需写if
            else if(y == Money)
            {
                Money = x;
            }
        }
        //此处打印所在哪个杯子里
        System.out.println(Money);

    }
}
