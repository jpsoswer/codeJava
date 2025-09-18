package test04.chafenTest;

import java.util.Scanner;

public class chafenTestDemo1 {
    static int[] arr = new int[5000006];
    static int[] drr = new int[5000006];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        //输入数据
        for (int i = 1; i <= n; i++) {
            arr[i]=scan.nextInt();
        }
        //先做差分
        drr[1] = arr[1];
        for (int i = 2; i <= n; i++) {
            drr[i]=arr[i]-arr[i-1];
        }

        //做增值操作
        while (m!=0)
        {
            int l = scan.nextInt();
            int r = scan.nextInt();
            int k = scan.nextInt();
            drr[l]+=k;
            drr[r+1]-=k;
            m--;
        }
        int min = Integer.MAX_VALUE;
        //再做前缀和
        //求最小值
        for (int i = 1; i <=n; i++) {
            drr[i]+=drr[i-1];
            if(drr[i]<min)
            {
                min=drr[i];
            }
        }

        System.out.println(min);

    }
}
