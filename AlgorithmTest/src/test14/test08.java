package test14;

import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        //求这个字符串的所有子串
        long sum = n*(n+1)/2;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int k=0;
            if(s.charAt(i) == '1')
            {
                continue;
            }
            while (i<n && s.charAt(i)=='0')
            {
                k++;
                i++;
            }
            ans+=k*(k+1)/2;
        }
        System.out.println(sum-ans);
    }
}
