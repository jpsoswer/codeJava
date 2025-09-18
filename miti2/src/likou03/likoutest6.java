package likou03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class likoutest6 {
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
        ArrayList<Integer> arrji = new ArrayList<>();
        ArrayList<Integer> arrou = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0)
            {
                arrou.add(nums[i]);
            }
            else {
                arrji.add(nums[i]);
            }
        }
        Collections.sort(arrji);
        Collections.sort(arrou);
        int count = 0;
        for (int i = 0; i < arrou.size(); i++) {
            nums[count] = arrou.get(i);
            count++;
        }
        for (int i = 0; i < arrji.size(); i++) {
            nums[count] = arrji.get(i);
            count++;
        }
        return nums;
    }
    //3,1,2,4
}
