package test3;

import java.util.Scanner;

public class LuoManumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.println("请输入字符串：");
            String str = in.next();
            boolean check = checktr(str);
            StringBuilder s = new StringBuilder();
            if(check)
            {
                for(int i=0;i<str.length();i++)
                {
                    char c =str.charAt(i);
                    int number = c - 48;
                    s.append(luomaNumber(number) + " ");
                }
                System.out.println(s);
                break;
            }
            else
            {
                System.out.println("输入错误，请重新输入！");
            }
        }
    }
    public static boolean checktr(String str)
    {
        if(str.length() > 9)
        {
            return false;
        }
        for(int i =0 ;i<str.length();i++)
        {
            if(str.charAt(i) < '0' && str.charAt(i) > '9' )
            {
                return false;
            }
        }
        return true;
    }
    public static String luomaNumber(int number)
    {
        String[] luoma = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};

        return luoma[number];
    }
}
