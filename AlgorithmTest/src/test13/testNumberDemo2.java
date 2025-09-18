package test13;

import java.util.Scanner;

public class testNumberDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        long minbeishu = minbeishu(arr[0], arr[1])%998244353;
        for (int i = 2; i < n; i++) {
            minbeishu=gcd(minbeishu,arr[i])%998244353;
        }
        System.out.println(minbeishu%998244353);
    }

    //求最大公因数
    public static long gcd(long x,long y)
    {
        while (y!=0)
        {
            long t = y;
            y = x%y;
            x = t;
        }
        return x;
    }

    //求最小公倍数
    public static long minbeishu(long x,long y)
    {
        return Math.abs(x*y)/gcd(x,y);
    }

}
