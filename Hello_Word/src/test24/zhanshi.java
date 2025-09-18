package test24;
import java.util.Scanner;
import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class zhanshi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//士兵数量
        long s = scan.nextLong();//组团需要的金币费用

        long[][] arr = new long[n][2];
        for(int i = 0;i < n;i++) {
            // 读取第 i 个士兵的训练成本 p_i 和所需训练次数 c_i
            arr[i] = new long[]{scan.nextLong(),scan.nextLong()};
        }
        // 按所需训练次数 c_i 升序排序
        Arrays.sort(arr,0,n,Comparator.comparingLong((long[] a)->a[1]).thenComparingLong(a->a[0]));

        // 计算训练成本的前缀和数组 pre
        long[] pre = new long[n+1];
        for(int i = 1;i <= n;i++) {
            pre[i] = pre[i - 1] + arr[i - 1][0];
        }
        //花费的金币，和训练的次数
        long result = 0,count = 0;
        //遍历完成一位士兵的训练次数，剩下人需要金币的费用
        for(int i = 0;i < n;i++) {
            // 计算从当前士兵到最后一个士兵的总训练成本
            long total = pre[n] - pre[i];//也因为前面排了序，次数最少的士兵肯定是前缀的前面那个
            // 如果当前总训练成本大于等于组团训练的成本 s，则选择组团训练
            if(total >= s) {
                result += (arr[i][1] - count) * s;
                //因为之前排序了，次数最小的肯定在前面，所以之后的数据肯定都是大于或者等于最小的次数的
                count = arr[i][1];
            }else {
                //单独训练1个士兵，减去之前训练过团购的训练次数
                result += (arr[i][1] - count) * arr[i][0];
            }
        }
        System.out.print(result);
    }
}