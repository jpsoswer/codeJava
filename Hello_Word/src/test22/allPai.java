package test22;

import java.util.Scanner;

public class allPai {
    static final long MOD= 998244353 ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if(n==2)
        {
            System.out.println(1);
        }else {
            long psu=2;
            long sum=3;
            long ans=1;
            for (int i = 3; i <= n; i++) {
                ans=((psu*sum+ans*i)%MOD+MOD)%MOD;
                sum=(sum+i)%MOD;
                psu=(psu*i)%MOD;
            }
            System.out.println(ans);

        }
            }
}
