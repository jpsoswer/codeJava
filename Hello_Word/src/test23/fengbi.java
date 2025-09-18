package test23;

import java.util.Arrays;
import java.util.Scanner;

public class fengbi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i <arr.length ; i++) {
            //二维数组两列分别存储输入的数据，以及存储图形个数
            arr[i][1]=scan.nextInt();
            arr[i][0]=dfs(arr[i][1]);
        }
        //自定义排序
        //lamba表达式  解释：(如果数组中有两个封闭图形个数一样，就按输入数据的大小排序，反之亦然)；
        Arrays.sort(arr,(o1,o2)->o1[0]==o2[0] ? o1[1]-o2[1] : o1[0]-o2[0]);
        //遍历输出
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i][1]+" ");
        }
    }
    public static int dfs(int n)
    {
        //定义各个数字所代表的封闭图形个数
        int[] shhu ={1,0,0,0,1,0,1,0,2,1};
        //创建计数器记录总个数
        int temp=0;
        //循环遍历求出每一个数位的封闭图形个数
        while (n>0)
        {
            temp+=shhu[n%10];
            n/=10;
        }
        return temp;
    }
}
