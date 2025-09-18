package test02.StringDemo;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String str = scan.next();
        char c = str.charAt(0);
        char[] charArray = s.toCharArray();
        System.out.println(find(charArray,c));
    }
    public static int find(char[] charArray,char c)
    {
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]==c)
            {
                return i+1;

            }
        }
        return -1;
    }
}
