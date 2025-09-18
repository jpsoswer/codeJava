package test01;

import java.util.Scanner;

public class testDemo3 {
    //二分查找平衡板
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }

        int target = scan.nextInt();

        int l=0;
        int r = arr.length;

        while (l+1<r)
        {
            int mind = (l+r) >>> 1;

            if(arr[mind] > target)
            {
                r=mind;
            }
            else {
                l=mind;
            }
        }
        System.out.println(l);
    }
}
