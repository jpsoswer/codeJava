package test02.arrayTest;

import java.util.Scanner;

public class arrayTestDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =  scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        int[] sum = new int[n+1];
        for (int i = 1; i < sum.length; i++) {
            sum[i]+=sum[i-1]+arr[i-1];
        }
        long num=0;
        for (int i = 0; i < sum.length; i++) {
            num+=sum[i];

        }

        System.out.println(num);
    }
}
