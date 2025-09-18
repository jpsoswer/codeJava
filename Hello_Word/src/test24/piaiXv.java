package test24;

import java.util.Scanner;

public class piaiXv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  =scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n+1];
        int[] brr = new int[m];
        for (int i = 1; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        for (int i = 0; i < brr.length; i++) {
            brr[i]=scan.nextInt();
        }
        boolean on = true;
        while (on)
        {
            on=false;
            for(int i=0;i<m;i++)
            {
                if(brr[i]<n && arr[brr[i]]>arr[brr[i]+1])
                {
                    int t =arr[brr[i]];
                    arr[brr[i]]=arr[brr[i]+1];
                    arr[brr[i]+1] = t;
                    on=true;
                }
            }
        }
        for (int i=1;i<n;i++)
        {
            if(arr[i]>arr[i+1])
            {
                System.out.println("NO");
                return;
            }

        }
        System.out.println("YES");
    }
}
