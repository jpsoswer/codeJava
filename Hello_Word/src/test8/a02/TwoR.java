package test8.a02;

import java.util.Scanner;

public class TwoR {
    public static void main(String[] args) {
        int[] nums = {1,3,4,4,4,6,6,8,10,14};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int x = rightmost(nums,target);
        System.out.println(x);
    }

    private static int rightmost(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l <= r)
        {
            int mind = (r+l) >>> 1;
            if(nums[mind] <= target)
            {
                l = mind+1;
            }
            else {
                r = mind-1;
            }
        }
        return l-1;
    }
}
