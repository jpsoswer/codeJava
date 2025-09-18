package test14;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int left =0;
        int maxleft = 1;
        for (int i = 1; i <n; i++) {
            if(arr[i-1]==arr[i])
            {
                left = i;
            }
            maxleft = Math.max(maxleft,i-left+1);
        }
        System.out.println(maxleft);
    }
}
