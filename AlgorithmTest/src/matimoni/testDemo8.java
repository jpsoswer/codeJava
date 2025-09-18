package matimoni;

import java.util.Scanner;

public class testDemo8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int  m = scan.nextInt();
        int[] arr = new int[10];
        for (int i = n; i <=m; i++) {
            int k = i;
            while (k!=0)
            {
                int i1 = k % 10;
                arr[i1]++;
                k/=10;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
