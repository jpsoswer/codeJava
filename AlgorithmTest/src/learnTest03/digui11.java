package learnTest03;

import java.util.Scanner;

public class digui11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int m= scan.nextInt();
        int ji = n*(m-1);

        if (ji <= 0) {
            System.out.println(0);
            return;
        }
        long[] dp = new long[ji+1];
        // 初始化斐波那契数列
        if (ji >= 1) dp[1] = 1;
        if (ji >= 2) dp[2] = 2;

        for (int i = 3; i <= ji; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[ji]);
    }


}
