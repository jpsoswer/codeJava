package test23;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class paiXV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<n; ++i){
            String str = scanner.nextLine();
            for (String s : str.split(" ")){
                list.add(Integer.valueOf(s));
            }
        }
        Integer[] nums = new Integer[list.size()];
        nums = list.toArray(nums);
        Arrays.sort(nums);
        int m = 0;
        int c = 0;
        for (int i=1; i<nums.length; ++i){
            if (nums[i] - nums[i-1] > 1){
                m = nums[i-1] + 1;
            }
            if (nums[i].equals(nums[i-1])){
                c = nums[i-1];
            }
            if (m * c > 0){
                System.out.println(m + " " + c);
                break;
            }
        }
    }
}