package test24;

import java.util.Arrays;
import java.util.Scanner;

public class zsextence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        long money = scan.nextLong();
        long[][] arr = new long[n][2];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0]=scan.nextLong();
            arr[i][1]=scan.nextLong();
        }
        //排序按照次数进行升序排序
        Arrays.sort(arr,(o1,o2)-> (int) (o1[1]-o2[1]));
        //进行前缀和遍历
        long[] presum = new long[n+1];
        for (int i = 1; i <presum.length ; i++) {
            presum[i]=presum[i-1]+arr[i-1][0];
        }
        long moneyNumber=0;
        long count=0;
        for (int i = 0; i < n ; i++) {
            long taetal = presum[n]-presum[i];
            if(taetal>=money)
            {
                moneyNumber+=(arr[i][1]-count)*money;
                count=arr[i][1];
            }
            else {
                moneyNumber+=(arr[i][1]-count)*arr[i][0];
            }
        }
        //打印
        System.out.println(moneyNumber);

    }
}
