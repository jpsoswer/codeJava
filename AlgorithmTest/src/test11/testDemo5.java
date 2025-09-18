package test11;


import java.util.Arrays;

import java.util.Scanner;

public class testDemo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        long hui = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }

        Arrays.sort(arr);
        for (int i = 0; i < n && k>0; i++) {
            while (k>0 && arr[i]>0)
            {
                hui+=arr[i];
                arr[i]--;
                k--;
                if(arr[i]<=0)
                {
                    break;
                }
            }
        }
        System.out.println(hui);

    }
}
