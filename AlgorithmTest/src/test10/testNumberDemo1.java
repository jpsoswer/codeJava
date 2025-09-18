package test10;

import java.util.Scanner;

public class testNumberDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int l = scan.nextInt();
        int sum1 =0;
        int sum2 =0;
        while (true)
        {
            int t = Math.abs(l-n);

            l-=t;
            if(l<0)
            {
                break;
            }
            sum1+=t;

            int t1 = Math.abs(l-m);
            l-=t1;
            if(l<0)
            {
                break;
            }

            sum2+=t1;
        }
        System.out.println(sum1+" "+sum2);
    }
}
