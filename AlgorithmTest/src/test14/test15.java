package test14;

import java.util.Arrays;
import java.util.Scanner;

public class test15 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int count=0;
        char key = scan.next().charAt(0);
        char[][] arr = new char[n+2][m+2];
        int[][] brr = new int[n+2][m+2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = key;
            }
        }
        for (int i = 1; i <= n; i++) {
            String s = scan.next();
            for (int j = 1; j <= m; j++) {
                char c = s.charAt(j-1);
                if(c=='0')
                {
                    c=key;
                }
                arr[i][j] = c;
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(arr[i][j]==key)
                {
                    if(brr[i-1][j]==0&&arr[i-1][j]!=key)
                    {
                        count++;
                        brr[i-1][j]=1;
                    }
                    if(brr[i+1][j]==0&&arr[i+1][j]!=key)
                    {
                        count++;
                        brr[i+1][j]=1;
                    }
                    if(brr[i][j-1]==0&&arr[i][j-1]!=key)
                    {
                        count++;
                        brr[i][j-1]=1;
                    }
                    if(brr[i][j+1]==0&&arr[i][j+1]!=key)
                    {
                        count++;
                        brr[i][j+1]=1;
                    }
                }


            }

        }
        System.out.println(count);

    }
}
