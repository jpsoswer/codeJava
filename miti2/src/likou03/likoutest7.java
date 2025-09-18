package likou03;

import java.util.Scanner;

public class likoutest7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        int[] nums1 = sortArrayByParity(nums);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }

    public static int[] sortArrayByParity(int[] nums) {
        int l = 0,r = nums.length-1;
        while (l<r)
        {
            if(nums[r]%2==0 && nums[l]%2==1)
            {
                int t = nums[l];
                nums[l] = nums[r];
                nums[r] = t;
                l++;
                r--;
            }
            else if(nums[l]%2==0)
            {
                l++;
            } else if (nums[r]%2==1) {
                r--;
            }
        }
        return nums;
    }
    //[0,1,2]
}
