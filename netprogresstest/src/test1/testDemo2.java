package test1;

import java.util.Scanner;

public class testDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        //给数组输入数据
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        int target = scan.nextInt();

        //创建边界
        int l=0;
        int r=arr.length-1;
        //创建循环
        while (l<=r)
        {
            //求中间点
            int mind = (l+r)>>>1;  //也可以l+(r-l)/2,这么做是为了防止露数据

            //创建判断条件
            if(target >= arr[mind])
            {
                l=mind+1;
            }
            else {
                r=mind-1;
            }
        }
        System.out.println(l-1);
    }
}
