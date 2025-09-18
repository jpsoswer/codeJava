package learnTest03;

import java.util.Scanner;

public class digui1 {
    public static boolean predictTheWinner(int[] nums) {

        return check(nums,0,nums.length-1) >= 0;
    }

    public static int check(int[] nums,int left,int right)
    {
        if(left==right)
        {
            return nums[left];
        }
        int l = nums[left]-check(nums,left+1,right);
        int r = nums[right]-check(nums,left,right-1);
        return Math.max(l,r);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        boolean b = predictTheWinner(arr);
        System.out.println(b);
    }
}