package test12;

import java.util.Scanner;

public class testArrayDemo1 {
    static int[][] arr = new int[1010][1010];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //表示有几个炸弹
        int n = scan.nextInt();
        int count = 0;
        //1表示有炸弹
        for (int i = 0; i < n; i++) {
            arr[scan.nextInt()][scan.nextInt()] = 1;
        }
        //开始位置
        int statopen = 0;
        //结束位置
        int statend = 499;
        for (int i = 0; i < 1000; i++) {
            count+=(statend-statopen+1);
            int sum = 0;
            for (int j = 0; j < 1000; j++) {
                if (arr[i][j] == 1 && j<=statend)
                {
                    sum+=(i-j);
                }
            }
            statend+=sum;
            if(statend>999)
            {
                statend=999;
            }
            if(statend<0)
            {
                statend=0;
            }
        }
        System.out.println(count);
    }
}
