package test11;

import java.util.Scanner;

public class testDemo8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] p = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                p[i][j] = scan.nextInt();
            }
        }
        for (int i = 1; i < n; i++) {
            int[][] q = new int[m][m];
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < m; k++) {
                    q[j][k] = scan.nextInt();
                }
            }
            p = fff(p,q,m);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] fff(int[][] p,int[][] q,int m)
    {
        int[][] h = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                int sum=0;
                for (int k = 0; k < m; k++) {
                  sum+=p[i][k]*q[k][j];
                }
                h[i][j]=sum%2;
            }
        }
        return h;
    }

}
