package test01.testArray;

import java.util.Scanner;

public class testArrayDemo5 {
    public static int  Left(int[] nums,int target)
    {
        int i = 0,j = nums.length -1;
        int age = -1;
        while(i <= j)
        {
            int mind = (i+j) >>> 1;
            if(target < nums[mind])
            {
                j = mind - 1;
            }
            else if(target > nums[mind])
            {
                i = mind + 1;
            }
            else{
                age = mind;
                j = mind - 1;
            }
        }
        return age;
    }
    public static int Right(int[] nums,int target)
    {
        int i = 0,j = nums.length -1;
        int age = -1;
        while(i <= j)
        {
            int mind = (i+j) >>> 1;
            if(target < nums[mind])
            {
                j = mind - 1;
            }
            else if(target > nums[mind])
            {
                i = mind + 1;
            }
            else{
                age = mind;
                i = mind + 1;
            }
        }
        return age;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        int[] brr  = new int[m];
        for (int i = 0; i < m; i++) {
            String s=scan.next();
            int target=scan.nextInt();
            if(s.equals("L"))
            {
                brr[i]=Left(arr,target);
            } else if (s.equals("R")) {
                brr[i]=Right(arr,target);
            }
        }

        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }
    }
}
