package likou07;

import java.util.HashMap;
import java.util.Scanner;

public class likouTest2461 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        long l = maximumSubarraySum(nums, k);
        System.out.println(l);
    }
    public static long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        long count = 0;
        long ans = 0;
        for (int i = 0; i < nums.length; i++) {
            count+=nums[i];
            if (hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else {
                hm.put(nums[i],1);
            }
            int left = i-k+1;
            if(left<0)
            {
                continue;
            }
            if(hm.size()==k)
            {
                ans = Math.max(count,ans);
            }
            //删除窗头数据
            int out = nums[left];
            count-=out;
            int c = hm.get(out);
            if(c>1)
            {
                hm.put(out,c-1);
            }
            else {
                hm.remove(out);
            }
        }
        return ans;
    }
}
