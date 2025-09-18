package learnTest03;

import java.util.Scanner;

//反向打印字符串
public class digui4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String digui = digui(s, s.length() - 1);
        System.out.println(digui);
    }
    public static String digui(String s,int number)
    {
        if(number==0)
        {
            return s.charAt(number)+"";
        }
        return (s.charAt(number)+"")+digui(s,number-1);
    }
}
