package test01.testArray;

import java.util.Scanner;

public class testArrayDemo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
        int[][] lr = new int[m][2];
        for (int i = 0; i < lr.length; i++) {
            lr[i][0] = scanner.nextInt();
            lr[i][1] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int l = lr[i][0];
            int r = lr[i][1];
            int[] crr = new int[r-l+1];
            int[] drr = new int[r-l+1];

            //将范围内的元素存放到crr当中
            for (int j=l-1;j<r;j++)
            {
                crr[j-l+1] = arr[j];
            }

            for (int k=0;k<r-l+1;k++)
            {
                drr[k] =crr[r-l-k];
            }

            for (int o=0;o<r-l+1;o++)
            {
                arr[l-1+o] = drr[o];
            }

        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j]+" ");
        }


    }
}
