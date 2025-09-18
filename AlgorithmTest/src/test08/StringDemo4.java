package test08;

import java.util.Scanner;

//测试用例：REPEAT 5[ FD 50 REPEAT 10[FD 100]]
public class StringDemo4 {
    static char[] arr;
    static int from=0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        arr = s.toCharArray();
        //要求非负整数
        System.out.println(Math.abs(sumfou()));
    }
    //求数字的大小
    static int intfrom()
    {
        int number=0;
        int count=0;
        //注意边界判断
        while (from<arr.length&&arr[from]>='0' && arr[from]<='9')
        {
            //防止数字有多位
            number*=10;
            number+=(arr[from++]-'0');
            //count++;
        }
        return number;
    }

    static long sumfou()
    {
        long shu=0;
        //判断结束条件
        while (from < arr.length && arr[from]!=']')
        {
            if(arr[from]=='[' || arr[from]==' ')
            {
                from++;
                continue;
            }
            if(arr[from] == 'R')
            {
                from+=7;
                shu += intfrom()*sumfou();
            }

            else if(arr[from] == 'F')
            {
                from+=3;
                shu += intfrom();
            }

            else if(arr[from] == 'B')
            {
                from+=3;
                shu -= intfrom();
            }
        }
        //跳过"]"from值也需要++
        from++;
        return shu;
    }

}
