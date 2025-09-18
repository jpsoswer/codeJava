package test13;

import java.util.Scanner;
/*
abc abc
abc acb
aba cba
 */
public class testStringDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            String s1 = scan.next();
            String s2 = scan.next();

            if(s1.equals(s2))
            {
                System.out.println("Y");
                continue;
            }
            int left = 0;
            int right = s1.length()-1;
            while (left<s1.length() && s1.charAt(left)==s2.charAt(left))
            {
                left++;
            }
            while (right>=0 && s1.charAt(right) == s2.charAt(right))
            {
                right--;
            }
            String str1 = s1.substring(left,right+1);
            String str2 = s2.substring(left,right+1);

            StringBuilder sb = new StringBuilder(str2).reverse();
            if(str1.equals(sb.toString()))
            {
                System.out.println("Y");
            }else {
                System.out.println("N");
            }
        }
    }
}
