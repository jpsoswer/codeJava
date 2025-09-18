package matimoni;

import java.util.Scanner;

public class testDemo9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        int[] brr = new int[m];
        for (int i = 0; i < m; i++) {
            int l=scan.nextInt();
            int r = scan.nextInt();
            int x = scan.nextInt();
            for (int j = l-1; j <r; j++) {
                if(arr[j]>=x)
                {
                    brr[i]++;
                }
            }
        }

        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }
    }
}
