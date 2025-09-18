package test02.arrayTest;

import java.util.Scanner;

public class arayTestDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r =  scan.nextInt();
        int[] arr = new int[r];
        for (int i = 0; i < arr.length; i++) {
            if((i+1)%8!=0)
            {
                arr[i]=i+1;
            }
        }
        int[] sum = new int[r+1];
        for (int i = 1; i < sum.length; i++) {
            if(i%8!=0)
            {
                sum[i]+=sum[i-1]+arr[i-1];
            }
        }
        long num=0;
        long snum=0;
        for (int i = 0; i < sum.length; i++) {
            num+=sum[i];

        }
        for (int i = 0; i < l; i++) {
            snum+=sum[i];
        }
        System.out.println(num-snum);



    }
}
