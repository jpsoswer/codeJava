package test24;

import java.util.Arrays;
import java.util.Scanner;

public class sansuo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        long[] arr = new long[n];
        long[] brr = new long[n];
        long[] crr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            brr[i]=scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            crr[i]=scan.nextInt();
        }
        long[] x=new long[n];
        long[] y=new long[n];
        long[] z=new long[n];
        for (int i = 0; i < n; i++) {
            long a=arr[i];
            long b = brr[i];
            long c = crr[i];
            x[i]=a-b-c;
            y[i]=b-a-c;
            z[i]=c-a-b;
        }
        Arrays.sort(x);
        Arrays.sort(y);
        Arrays.sort(z);
        long sum=0,sun=0,sul=0;
        int d=-1;
        for (int i = n-1; i >=0 ; i--) {
            sum+=x[i];
            sun+=y[i];
            sul+=z[i];
            if(sum>0 || sun>0 || sul>0)
            {
                d=n-i;
            }
        }
        System.out.println(d);
    }
}
