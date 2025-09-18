package test4;

import java.util.Arrays;
import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            min = Math.min(min,arr[i] - arr[i-1]);
        }
        System.out.println(min);
    }
}
