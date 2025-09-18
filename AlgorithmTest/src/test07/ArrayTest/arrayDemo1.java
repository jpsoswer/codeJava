package test07.ArrayTest;

import java.util.Scanner;

public class arrayDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0]=i+1;
            arr[i][1]=n/arr[i][0];
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i][0]*arr[i][1];
        }
        System.out.println(sum);
    }
}
