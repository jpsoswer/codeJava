package test07.ArrayTest;

import java.util.Arrays;
import java.util.Scanner;

public class arrayDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[100];
        int count=1;
        for (int i = 1; i <arr.length; ) {
            for (int j = 1; j <=count; j++) {
                if(i<arr.length)
                {
                    arr[i]=count;
                    i++;
                }
            }
            count++;
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i]+=arr[i-1];
        }
        int[][] brr = new int[n][2];
        int[] su = new int[n];
        for (int i = 0; i < brr.length; i++) {
            brr[i][0]=scan.nextInt();
            brr[i][1]=scan.nextInt();
            if(brr[i][0]==brr[i][1])
            {
                su[i]=arr[i];
            }

            su[i]=arr[brr[i][1]]-arr[brr[i][0]-1];
        }

        for (int i = 0; i < su.length; i++) {
            System.out.println(su[i]);
        }
    }
}
