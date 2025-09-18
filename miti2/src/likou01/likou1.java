package likou01;

import java.util.Scanner;

public class likou1 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int[] nums = new int[10];
        int target = scan.nextInt();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scan.nextInt();
        }
        int[] arr = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j <nums.length; j++) {
                if(nums[i]+nums[j]==target)
                {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
