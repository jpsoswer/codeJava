package mati2;

import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int number = scan.nextInt();
            int shu = scan.nextInt()-1;
            int[] brr = arr[shu];
            int chi = scan.nextInt();
            if(number==1)
            {

                for (int j = 0; j <chi; j++) {
                    int key = brr[0];
                    for (int k = 1; k < m; k++) {
                        brr[k-1] = brr[k];
                    }
                    brr[m-1] = key;
                }
            }
            else if(number==2)
            {

                for (int j = 0; j < chi; j++) {
                    int key = brr[m-1];
                    for (int k = m-2; k >= 0; k--) {
                        brr[k+1] = brr[k];
                    }
                    brr[0] = key;
                }
            }
            for (int j = 0; j < m; j++) {
                arr[shu][j]=brr[j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
