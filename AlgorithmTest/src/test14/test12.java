package test14;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int ji = 0;
        if(n%2==1)
        {
            ji = n/2+1;
        }
        else {
            ji = n/2;
        }
        int count=0;
        long[] brr = new long[ji];
        for (int i = 0; i < n; i+=2) {
            if(i==n-1)
            {
                brr[count]+=arr[i];
                break;
            }
            brr[count] = arr[i]+arr[i+1];
            count++;
        }
        long sum=0;
        for (int i = 0; i < ji; i++) {
            if(i%2==0)
            {
                sum+=brr[i];
            }
            else {
                sum-=brr[i];
            }
        }
        System.out.println(sum);
    }
}
