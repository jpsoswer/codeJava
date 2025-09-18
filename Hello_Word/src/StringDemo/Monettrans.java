package StringDemo;

import java.util.Scanner;

public class Monettrans {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入金额：");
        int money = in.nextInt();
        String Money = "";
        while(true)
        {
            if(money >=0 && money <= 9999999)                //判断数值是不是在七位数以内
            {
                while(true)
                {
                    int ge = money%10;                        //求出数的每一位
                    Money = bigshu(ge) + Money;               //调用函数，转大写
                    money = money/10;
                    if(money==0)
                    {
                        break;                                //money==0跳出循环
                    }
                }
                int count = 7-Money.length();                 //比七位数少几位就补几个零
                for(int i=0;i<count;i++)
                {
                    Money = "零"+Money;
                }
                String Moneyone = "";
                for(int i = 0;i<Money.length()-1;i++)             //建一个新的空字符串来接受更加方便
                {
                    Moneyone = Moneyone+weishu(Money.charAt(i),i);
                }
                Moneyone+=Money.charAt(Money.length()-1);           //补上最后一位
                System.out.println(Moneyone);
                break;
            }
            else{
                System.out.println("输入错误请重新输入");
            }
        }


    }
    public static String bigshu(int number)               //各数值的大写形式通过索引获取
    {
        String[] arr ={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }
    public static String weishu(char s,int i)               //获取位
    {
        String sum ="";                                     //定义一个新的字符串神来之笔
        String[] arr ={"百","十","万","千","百","十"};
        sum = s+arr[i];
        return sum;
    }
}
