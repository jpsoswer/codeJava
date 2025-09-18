package test;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int in = arr[0];
        int two = arr[1];
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(in==two)
            {
                break;
            }
            if(in == arr[i] && two == arr[i+1])
            {
                count+=2;
            }
        }
        System.out.println(count);

    }
}
