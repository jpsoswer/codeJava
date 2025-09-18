package test02.StringDemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] charArray = s.toCharArray();
        char max = '0';
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]>max)
            {
                max=charArray[i];
            }
        }
        System.out.println(max);
    }
}
