package learnTest03;

import java.util.Scanner;

//递归模拟冒泡排序
public class digui7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        digui(arr,arr.length-1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void digui(int[] arr,int j)
    {
        //结束条件
        if(j==0)
        {
            return;
        }
        int x=0;
        for (int i = 0; i < j; i++) {
            if(arr[i]>arr[i+1])
            {
                int t = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = t;
                x=i;
            }
        }
        digui(arr,x);
    }
}
