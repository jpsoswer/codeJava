package test08;

import java.util.Scanner;

public class StringDemo3 {
    static char[] arr;
    static int n=0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        arr = s.toCharArray();
        String f = f();
        System.out.println(f);
    }

    //返回数字的大小
    static int intfrom()
    {
        int number=0;
        while (arr[n]>='0'&&arr[n]<='9')
        {
            //防止数字有多位
            number*=10;
            //求出数字的大小
            number+=(arr[n++]-'0');
        }
        return number;
    }
    static String f(){
        //用sb来拼接字符串，大大提高效率防止资源的浪费
        StringBuilder sb  = new StringBuilder();
        //判断结束条件
        while (n<arr.length && arr[n]!= ']')
        {
            //可是判断是否以‘[’开头
            if(arr[n]=='[')
            {
                n++;
                int lei = intfrom();
                String next = f();
                //插入lei个next字符串
                for (int i=0;i<lei;i++)
                {
                    sb.append(next);
                }
            }
            else {
                sb.append(arr[n]);
            }
            n++;
        }
        return sb.toString();
    }
}
