package test11;

import java.util.Scanner;

public class testDemo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[q];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        for (int i = 0; i < brr.length; i++) {
            brr[i] = scan.nextInt();
        }
        int index=0;
        for (int i = 0; i < brr.length; i++) {
            if(brr[i]==1)
            {
                index++;
            }
            else {
                index--;
            }
            if(index>=n)
            {
                index=0;
            }
            if(index<0)
            {
                index = n-1;
            }
        }
        for (int i = index; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
