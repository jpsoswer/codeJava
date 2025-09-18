package test14;

import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        //构建前缀和数组
        long[][] arr = new long[n+1][m+1];
        //遍历计算前缀和的值
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                 long cur= arr[i][j] = scan.nextLong();
                 arr[i][j] = arr[i][j-1]+arr[i-1][j]-arr[i-1][j-1]+cur;
            }
        }
        //遍历计算g(x,y)的值
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                long g = arr[i][j]/(long)(i*j);
                System.out.print(g+" ");
            }
            System.out.println();
        }
    }
}
