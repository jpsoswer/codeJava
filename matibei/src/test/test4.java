package test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int count=0;
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j <n; j++) {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
        }
        System.out.println(count%100);
    }
}
