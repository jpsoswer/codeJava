package test10;
import java.util.*;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class TangSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//小朋友的人数
        int[] tang = new int[n];//表示每个小朋友的糖的个数
        int[] miss = new int[n];//小朋友失去糖的数量
        int[] get = new int[n];//小朋友得到糖的数量
        //初始化
        for(int i=0;i<n;i++){
            tang[i] = sc.nextInt();
        }
        int count = 0;//老师补发糖果的个数
        while (!deng(tang)){//当糖不都相等时执行
            for(int i=0;i<n;i++){
                miss[i] = tang[i]/2;
                get[i] = tang[(i+1)%n]/2;
            }
            for(int i=0;i<n;i++){
                tang[i] = tang[i]-miss[i]+get[i];
                if(tang[i]%2==1){//糖变成了奇数，要补一个
                    tang[i]+=1;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    //判断数组中元素是否都相等
    public static boolean deng(int[] a){
        int t = a[0];
        for(int i=0;i<a.length;i++){
            if(t!=a[i]){
                return false;
            }
        }
        return true;
    }
}