package likou03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class likoutest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        double v = minimumAverage(nums);
        System.out.println(v);
    }

    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length-1;
        double[] arr = new double[nums.length/2];
        for (int i = 0; i < nums.length / 2; i++) {
            arr[i] = (nums[l]+nums[r])/2.0;
            l++;
            r--;
        }
        Arrays.sort(arr);
        return arr[0];
    }
    //7,8,3,4,15,13,4,1
}
