package proticecode_2024_10_17;

import java.util.Scanner;

public class TwoFen {
    public static void main(String[] args) {
        int[] arr = {1,3,6,9,12,17,20,26,30};
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int l = 0;
        int r = arr.length;
        while(r-l > 1)
        {
            int mind = (l+r) >>> 1;
            if(x < arr[mind])
            {
                r = mind;
            }
            else{
                l = mind;
            }
        }
        if(arr[l] == x)
        {
            System.out.println(r);
        }
        else {
            System.out.println("没找到！");
        }
    }
}
