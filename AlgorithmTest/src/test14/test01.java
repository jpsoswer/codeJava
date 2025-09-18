package test14;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] arr = new long[n];
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextLong();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j <n; j++) {
                long min = Math.min(arr[i], arr[j]);
                sum+=min;
            }
        }
        System.out.println(sum);
    }
}
