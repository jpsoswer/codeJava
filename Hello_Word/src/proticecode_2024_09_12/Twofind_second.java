package proticecode_2024_09_12;

import java.util.Scanner;

public class Twofind_second {
    public static void main(String[] args) {
        int[] arr ={1,3,5,14,25,27,31,45,54};
        int mind = 0;
        int a= 0;
        Scanner in = new Scanner(System.in);
        int left = 0;
        int right = arr.length;
        int find = in.nextInt();
        while(left < right)
        {
            mind = (right+left) >> 1;
            a++;
            if(arr[mind] < find)
            {
                left = mind+1;
            }
            if(arr[mind] > find)
            {
                right = mind - 1;
            }
            if(arr[mind] == find)
            {
                System.out.println("找到了! 位置为: " + mind);
                break;
            }
        }
        System.out.println("找了" + a + "次!");
    }
}
