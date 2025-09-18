package test22;
import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class zhengfan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        long n =scan.nextLong();
        long mod =(long)Math.pow(10,9)+7;
        long ans=0;
        for(long i=1;i<n;i++)
        {
            ans+=i*(n-i)*(n-i);
            ans=ans%mod;
        }
        System.out.println(ans);
        scan.close();
    }
}