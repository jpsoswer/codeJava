package test10;

import java.util.Scanner;

public class testArrayDemo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=scan.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(iszi(arr[i][j]))
                {
                    count++;
                    int s = arr[i][j]%10;
                    if(j+s > arr[i].length-1)
                    {
                        break;
                    }
                    j+=(s-1);
                }
            }
        }
        System.out.println(count);
    }
    //判断是不是质数
    public static boolean iszi(int number)
    {
        for (int i = 2; i < number; i++) {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
