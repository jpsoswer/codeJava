package Test;

import java.util.Arrays;
import java.util.Random;

public class Sui {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int x=0;
        int y=0;
        int n = 1;
        //二维数组初始化
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0;j < arr[i].length;j++)
            {
                arr[i][j] = n;
                n++;
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

                if(arr[i][j] == 16)
                {
                    x = i;
                    y = j;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println(x);
        System.out.println(y);

    }
}
