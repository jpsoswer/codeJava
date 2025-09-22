package likou06;

import java.util.Arrays;
import java.util.Scanner;

public class likoutest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums= new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int[] nums1 = getAverages(nums, k);
        System.out.println(Arrays.toString(nums1));
    }
    public static int[] getAverages(int[] nums, int k) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr,-1);
        long count = 0;
        for (int i = 0; i < nums.length; i++) {
            count+=nums[i];
            int left = i-2*k;
            if(left<0)
            {
                continue;
            }
            arr[left+k] = (int)(count/(2*k+1));
            count-=nums[left];
        }
        return arr;
    }
    //7,4,3,9,1,8,5,2,6
}
