package test22;

import java.util.Arrays;
import java.util.Scanner;

public class fenbi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int k = arr[i];
            while(k!=0)
            {
                int m = k%10;
                if(m==0 || m==4 || m==6 || m==9)
                {
                    brr[i]++;
                } else if (m==8) {
                    brr[i]+=2;
                }
                k/=10;
            }
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }

        for(int i=1;i<brr.length;i++)
        {
            if(brr[i]<brr[i-1])
            {
                int t=arr[i];
                arr[i] = arr[i-1];
                arr[i-1]=t;
            }
        }
//        Arrays.sort(brr);
//        for (int i = 1; i < brr.length; i++) {
//            if(brr[i]==brr[i-1])
//            {
//                if(arr[i]<arr[i-1])
//                {
//                    int t=arr[i];
//                    arr[i] = arr[i-1];
//                    arr[i-1]=t;
//                }
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
