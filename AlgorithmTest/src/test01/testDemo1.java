package test01;

import java.util.Scanner;

public class testDemo1 {
    public static void main(String[] args) {
        //listmost
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        int target = scan.nextInt();
        //定义二分查找元素

        int l = 0;
        int r = arr.length-1;
        while (l<=r)
        {
            int mind = (l+r)>>>1;
            if(arr[mind] >= target)
            {
                r=mind-1;
            }
            else {
                l=mind+1;
            }
        }
        System.out.println(l);
    }
}
