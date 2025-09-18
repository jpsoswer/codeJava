package test1;

import java.util.Scanner;

public class testDemo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[2*n];
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
        for (int i = n; i < arr.length; i++) {
            arr[i]=arr[i-n];
        }
        long sum=Integer.MIN_VALUE;
        int target=0;
        for (int i = 0; i < arr.length-3; i++) {
            long num = arr[i]+arr[i+1]+arr[i+2]+arr[i+3];
            if(num>sum)
            {
                sum=num;
                target=i;
            }
        }
        System.out.println(sum);
        System.out.println(target+1);
    }
}
