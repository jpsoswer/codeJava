package proticecode_2024_09_13;

import java.util.Scanner;

public class TwoLeft {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,4,12,25,27,31,38,41,47,53};
        int x = in.nextInt();
        int left = 0;
        int right = arr.length-1;
        int min = 0;
        int a = 0;
        while(left <= right)
        {
            int mind = (left+right)/2;
            if(arr[mind] < x)
            {
                left= mind+1;
            }
            else if(arr[mind]>x)
            {
                right = mind - 1;
                if(min == 0)
                    min = mind;
            }
            else
            {
                System.out.println("找到了,下标为:" + mind);
                a = 1;
                break;
            }
        }
        if(a == 0)
        {
            System.out.println("最左边比x大的第一个位置为：" + min + "值为：" + arr[min]);
        }
    }
}
