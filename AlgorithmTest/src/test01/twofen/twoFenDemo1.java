package test01.twofen;

import java.util.Scanner;

public class twoFenDemo1 {
    static final int N=100010;
    static double[] arr = new double[N];
    static double[] sum = new double[N];
    static int n;
    static int f;

    public static boolean check(double mind)
    {
        double ans=sum[0];
        for (int i = 1; i <= n; i++) {
            sum[i]=sum[i-1]+arr[i]-mind;
        }
        for (int i=f;i<=n;i++)
        {
            ans = Math.min(ans,sum[i-f]);
            if(sum[i]-ans>=0)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        f=scan.nextInt();
        double l=1,r=Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            arr[i]=scan.nextDouble();
            r=Math.max(arr[i],r);
        }

        while (r-l >= 1e-6)
        {
            double mind = l+(r-l)/2;
            if(check(mind))
            {
                l=mind;
            }
            else {
                r=mind;
            }
        }

        System.out.println((int)(r*1000));
    }
}
