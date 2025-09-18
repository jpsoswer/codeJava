package test01.testArray;

import java.util.Scanner;

public class testArrayDemo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                System.out.println(arr[i]);
            }
        }
    }
}
