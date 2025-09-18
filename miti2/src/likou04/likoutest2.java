package likou04;

import java.util.Scanner;

public class likoutest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        double maxAverage = findMaxAverage(nums, k);
        System.out.println(maxAverage);
    }

    public static double findMaxAverage(int[] nums, int k) {
        int count = 0;
        double ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            count+=nums[i];
            int left = i-k+1;
            if(left<0)
            {
                continue;
            }
            ans = Math.max(ans,count/(double)k);
            count-=nums[left];
        }
        return ans;
    }
    //1,12,-5,-6,50,3
}
