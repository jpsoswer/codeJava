package test01.testArray;

import java.util.Scanner;

public class testArrayDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.MAX_VALUE;
        int[] arr = new int[n];
        int cnt=0;
        for (int i = 0; i < arr.length;) {
            for (int j=1;j<=cnt;j++)
            {
                if(i<=arr.length-1)
                {
                    arr[i]=cnt;
                    i++;
                }
            }
            cnt++;
        }

        int m = scan.nextInt();
        int[] left = new int[m];
        int[] right = new int[m];
        for (int i = 0; i < m; i++) {
            left[i]=scan.nextInt();
            right[i]=scan.nextInt();
        }
        long[] sum = new long[m+1];
        for (int i = 0; i < m; i++) {
            for (int j=left[i]-1;j<=right[i]-1;j++)
            {
                sum[i+1]+=arr[j];
            }
        }
        for (int i=1;i<=m;i++)
        {
            System.out.println(sum[i]);
        }
    }
}
