package test13;

import java.util.Scanner;

public class testNumberDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        System.out.println(minbeishhu(n,m));
    }

    //求最大公约数
    public static int gcd(int n,int m)
    {
        while (m!=0)
        {
            int t = m;
            m = n%m;
            n = t;
        }
        return n;
    }
    //求最小公倍数
    public static int minbeishhu(int n,int m)
    {
       return Math.abs(n*m)/gcd(n,m);
    }

}
