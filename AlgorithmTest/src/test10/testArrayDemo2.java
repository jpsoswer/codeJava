package test10;

import java.util.Scanner;

public class testArrayDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int t = scan.nextInt();
        int[][] arr =new int[n][m];
        int max_h=0,max_l=0,min_h=Integer.MAX_VALUE,min_l=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j]=scan.nextInt();

                if(arr[i][j]<=t)
                {
                    if(i>max_h)
                    {
                        max_h=i;
                    }
                    if(j>max_l)
                    {
                        max_l=j;
                    }
                    if(i<min_h)
                    {
                        min_h=i;
                    }
                    if(j<min_l)
                    {
                        min_l=j;
                    }
                }
            }
        }
        System.out.println(max_h-min_h+1);
        System.out.println(max_l-min_l+1);
    }
}
