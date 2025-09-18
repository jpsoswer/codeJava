package test8.a02;

import java.util.Scanner;

public class TwoLR {
    public void main(String[] args) {
        int[] nums = {5,5,8,8,9,14,16};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] i = searchRange(nums,target);
        System.out.println(i[0]);
        System.out.println(i[1]);
    }

    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        int x = leftmost(l,r,nums,target);
        int y = rightmost(l,r,nums,target);
        int[] arr = new int[2];
        arr[0] = x;
        arr[1] = y;
        return arr;
    }

    private int leftmost(int l, int r, int[] nums, int target) {
        while(l <= r)
        {
            int mind = (l+r) >>> 1;
            if(target <= nums[mind])
            {
                r = mind-1;
            }
            else{
                l = mind+1;
            }
        }
        return l;
    }

    private int rightmost(int l,int r,int[] nums,int target){
        while(l <= r)
        {
            int mind = (l+r) >>> 1;
            if(target >= nums[mind])
            {
                l = mind+1;
            }
            else{
                r = mind-1;
            }
        }
        return l-1;
    }
}

