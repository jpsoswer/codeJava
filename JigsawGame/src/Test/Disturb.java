package Test;

import java.util.Arrays;
import java.util.Random;

public class Disturb {
    public static void main(String[] args) {
        //创建一个二维数组
        int[][] arr = new int[4][4];
        int x = 1;
        //二维数组初始化
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j < arr[i].length;j++)
            {
                arr[i][j] = x;
                x++;
            }
        }
        //形成随机值
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j < arr[i].length;j++)
            {
                //形成0-4随机值
                int suiji = rd.nextInt(4);
                int suijione = rd.nextInt(4);
                //开始交换
                int t = arr[i][j];
                arr[i][j] = arr[suiji][suijione];
                arr[suiji][suijione] = t;
            }
        }
        System.out.println(Arrays.toString(arr[0]));
    }
}
