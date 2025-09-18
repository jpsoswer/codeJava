package test01;

import java.util.Scanner;

public class testDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        int target = scan.nextInt();
        int search = search(arr, target);
        System.out.println(search);
    }

    public static int search(int[] nums, int target) {
        int i = 0,j = nums.length;
        while(i<=j)
        {
            int mind = (i+j) >>>1;
            if(nums[mind] > target)
            {
                j=mind-1;
            }
            else if(nums[mind] < target)
            {
                i=mind+1;
            }
            else{
                return mind;
            }
        }
        return -1;
    }
}
