package test14;

import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long ans = 0;
        int mod = 100;
        //创建整数数组
        int[] number = new int[101];
        //遍历求值
        for (int i = 0; i < n; i++) {
            int zhi = scan.nextInt();
            for (int j = zhi+1; j <=100; j++) {
                ans = (ans+number[j])%mod;
            }
            number[zhi]++;
        }
        System.out.println(ans);
    }
}
