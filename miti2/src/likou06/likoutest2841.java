package likou06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class likoutest2841 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            al.add(arr[i]);
        }
        int m = scan.nextInt();
        int k = scan.nextInt();
        long l = maxSum(al, m, k);
        System.out.println(l);

    }

    public static long maxSum(List<Integer> nums, int m, int k) {

        long count = 0;
        long ans = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.size(); i++) {
            count+=nums.get(i);
            hs.add(nums.get(i));
            int left = i-k+1;
            if(left<0)
            {
                continue;
            }
            if(hs.size()>=m)
            {
                ans = Math.max(ans,count);
            }
            count -= nums.get(left);
            hs.remove(nums.get(left));
        }
        return ans;
    }
    //1,1,1,3
}
