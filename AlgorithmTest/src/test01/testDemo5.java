package test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class testDemo5 {
    //数组操作
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ArrayList<Integer> arr =new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }

        int m=scan.nextInt();
        int[] brr = new int[m];

        for (int i = 0; i < brr.length; i++) {
            brr[i]=scan.nextInt();
        }
        for (int i=0;i<brr.length;i++)
        {
            arr.remove(brr[i]-1);
        }
        for (Integer i : arr) {
            System.out.print(i+" ");
        }

    }
}
