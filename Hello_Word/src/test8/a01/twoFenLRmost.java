package test8.a01;

import java.util.Scanner;

public class twoFenLRmost {
    public static void main(String[] args) {
        int[] arr = {3,4,5,5,5,7,9,10,15};
        Scanner sc = new Scanner(System.in);
        int tagth = sc.nextInt();
        int l = 0;
        int r = arr.length - 1;
        int t = -1;
        while(l <= r)
        {
            int mind = (l+r) >>> 1;
            if(arr[mind] < tagth)
            {
                l = mind+1;
            }
            else if(arr[mind] > tagth)
            {
                r = mind-1;
            }
            else{
                t = mind;
                //查找最左边的指定值
                r = mind-1;
            }

        }
    }
}
