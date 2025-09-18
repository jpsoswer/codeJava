package test4;
//打乱字符串
import java.util.Random;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = in.nextLine();
        char[] arr = str.toCharArray();                    //将字符串的值赋给字符数组
        for(int i=0;i<arr.length;i++)                      //循环开始打乱
        {
            Random sj = new Random();
            int shui = sj.nextInt(arr.length);
            char t=arr[i];
            arr[i] = arr[shui];
            arr[shui] = t;

        }
        String s = new String(arr);
        System.out.println(s);                            //打印最终结果
    }
}
