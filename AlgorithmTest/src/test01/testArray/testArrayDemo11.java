package test01.testArray;

import java.util.Arrays;
import java.util.Scanner;

public class testArrayDemo11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        int min = arr[0];
        int l=0,r=arr.length-1;
        while (l<=r)
        {
            int mind = (l+r) >>> 1;
            if(arr[mind] <= min)
            {
                l=mind+1;
            }
            else {
                r=mind-1;
            }
        }
        int index=l;
        System.out.println(arr[index]);

    }
}
