package test22;
import java.util.Scanner;

public class Main {

    static final long MOD = 998244353;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        if (n==2) {
            System.out.print(1);
        }else {
            long prePailie = 2;
            long ans = 1;
            long sum = 3;
            for (int i = 3; i <= n; i++) {
                ans = ((prePailie * sum + ans*i)%MOD + MOD)%MOD;
                sum=(sum+i)%MOD;
                prePailie=(prePailie*i)%MOD;
            }
            System.out.print(ans);
        }
        scan.close();
    }
}