package learnTest03;

import java.util.Scanner;

//反向打印字符串（从头递归法）
public class digui5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        digui(s,0);
    }
    public static void digui(String s,int index)
    {
        //结束条件
        if(index == s.length())
        {
            return;
        }
        digui(s,index+1);
        System.out.print(s.charAt(index));
    }
}
