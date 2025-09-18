package test11;

import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        int[] arr = new int[n];
        Set<Integer> set = new HashSet<>();
        for(int i = 0;i<n;i++)
        {
            arr[i] = scan.nextInt();
            set.add(arr[i]);
        }
        int chang = set.size();
        int l = 0,r = n;
        while(l<r)
        {
            int mid = (l+r)>>>1;
            if(check(arr,mid,chang))
            {
                r=mid;
            }
            else{
                l = mid+1;
            }
        }
        System.out.println(l);
        scan.close();
    }
    public static boolean check(int[] arr,int mid,int chang)
    {
        int l=0,r=0,ans=0;
        int n = arr.length;
        int[] f = new int[1001];
        while(r<n)
        {
            f[arr[r]]++;
            if(f[arr[r]] == 1)
            {
                ans++;
            }
            if(r-l+1 > mid)
            {
                f[arr[l]]--;
                if(f[arr[l]]==0)
                {
                    ans--;

                }
                l++;
            }
            r++;
            if(ans >= chang)
            {
                return true;
            }
        }
        return false;
    }
}