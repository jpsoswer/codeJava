package test22;

import java.util.Scanner;

public class gaota {
    static int n,m,k;
    static final long MOD=(long)(1e9+7);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        k = scan.nextInt();
        long[] dp = new long[n+1];
        long[] sum = new long[n+1];
        dp[1]=1;
        sum[1]=1;
        for (int i = 2; i <=n ; i++) {
            long low =Math.max(i-m,0l);
            long up = Math.max(i-k,1l);
            dp[i]=((sum[(int)low]-sum[(int)(up-1)])+MOD)%MOD;
            sum[i]=(sum[i-1]+dp[i])%MOD;
        }
        System.out.println(dp[n]);
    }
}
