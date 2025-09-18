package test7.Findstatic.a04;

import java.util.Scanner;

public class JunXing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //这里输入矩形的大小为n*n
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        //遍历数组
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        //设置初始矩形

        int maxArray = arr[0][0] + arr[0][1] + arr[1][0] + arr[1][1];
        int sum = maxArray;
        //循环求出最大子矩形
        for(int i=2;i<n;i++)
        {
            for(int j=2;j<n;j++)
            {
                 sum=0;
            }
        }
        //输出二维数组中的值
//        for(int i=0;i<n;i++)
//        {
//            for (int j=0;j<n;j++)
//            {
//                System.out.println(arr[i][j]);
//            }
//        }
    }
}
