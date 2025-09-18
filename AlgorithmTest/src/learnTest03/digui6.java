package learnTest03;

import java.util.Scanner;

//用递归模拟二分查找
public class digui6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        int target = scan.nextInt();
        int digui = digui(n, arr, 0, arr.length - 1, target);
        System.out.println(digui);
    }

    public static int digui(int n,int[] arr,int l,int r,int target)
    {
        //结束条件
        if(l>r)
        {
            return -1;
        }

        int m = (l+r) >>> 1;
        if(target < arr[m])
        {
            return digui(n,arr,l,m-1,target);
        } else if (target > arr[m]) {
            return  digui(n,arr,m+1,r,target);
        }
        else {
            return m;
        }
    }
}
