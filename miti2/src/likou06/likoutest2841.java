package likou06;

import java.util.*;

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
    //cnt.merge(a[i], 1, Integer::sum);
    public static long maxSum(List<Integer> nums, int m, int k) {
        Integer[] a = nums.toArray(new Integer[nums.size()]);
        long count = 0;
        long ans = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {

            count+=a[i];
            mp.merge(a[i],1,Integer::sum);
            int left = i-k+1;
            if(left<0)
            {
                continue;
            }
            if(mp.size()>=m)
            {
                ans = Math.max(ans,count);
            }
            Integer c = a[left];
            count -= c;
            if(mp.get(c)>1)
            {
                mp.put(c,mp.get(c)-1);
            }
            else {
                mp.remove(c);
            }
        }
        return ans;
    }
    //1,1,1,3
}
