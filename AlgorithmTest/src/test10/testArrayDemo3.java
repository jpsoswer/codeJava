package test10;

import java.util.Scanner;

public class testArrayDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        boolean tf = false;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length-2; i++) {
            if(arr[i]-arr[i+1]<0 && arr[i+1]-arr[i+2]<0)
            {
                tf=true;
                break;
            }
        }
        if(tf)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
