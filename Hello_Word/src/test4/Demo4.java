package test4;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        int min = Math.abs(arr[0]-arr[1]);
        for(int i=1;i<n-1;i++)
        {
            int x = Math.abs(arr[i] - arr[i+1]);
            if(x<min)
            {
                min = x;
            }
        }
        System.out.println(min);
    }
}
