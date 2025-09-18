package test11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class he {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
            set.add(arr[i]);
        }
        int l=0,r=n;
        int m=set.size();//set存储不重复的数字
        while(l<r){
            int mid=(l+r)/2;
            if(check(mid,arr,m)) r=mid;
            else l=mid+1;
        }
        System.out.println(l);
    }
    public static boolean check(int mid,int []arr,int m){//滑动窗口求解
        int n=arr.length;
        int []f=new int[1001];//记录出现频率
        int l=0,r=0;//双指针
        int ans=0;//记录长度
        while(r<n) {//右指针没有到达数组最右边
            f[arr[r]]++;//记录一个数的频率
            if(f[arr[r]]==1){ ans++;}
            if(r-l+1>mid) {//当区间距离>mid,说明此时并没有满足ans>=m
                f[arr[l]]--;//左指针对应减一
                if(f[arr[l]]==0){//说明之前只有一个,减去后变成零,这个时候一个数字消失,对应的ans应减一
                    ans--;
                }
                l++;//左指针右移
            }
            r++;//右指针一直右移
            if(ans>=m) return true;
        }
        return false;
    }
}