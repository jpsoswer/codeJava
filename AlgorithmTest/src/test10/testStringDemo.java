package test10;

import java.util.Scanner;

/*
1.密码长度大于6。
2.密码中同时包括了大小写字母和数字。
3.并且数字和数字之间不能相连。
 */
public class testStringDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(str.length()>6 && daxiao(str) && shuzi(str))
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
    public static boolean shuzi(String str)
    {
        for (int i = 0; i < str.length()-1; i++) {
            char c = str.charAt(i);
            char c1 = str.charAt(i+1);
            if((c>='0' && c<='9')&&(c1>='0' && c1<='9'))
            {
                return false;
            }
        }
        return true;
    }


    public static boolean daxiao(String str)
    {
        int d=0;
        int xiao=0;
        int shu=0;
        for (int i = 0; i < str.length(); i++) {
            if(d>0&&xiao>0&&shu>0)
            {
                return true;
            }
            char c = str.charAt(i);
            if(c>='A' && c<='Z')
            {
                d++;
                continue;
            }
            if(c>='a' && c<='z')
            {
                xiao++;
                continue;
            }
            if(c>='0' && c<='9')
            {
                shu++;
            }
        }
        return false;
    }

}
