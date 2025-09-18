package test13;

import java.util.Scanner;

public class testArrayDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t!=0)
        {
            int n = scan.nextInt();
            int[] arr = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            for (int i = 1; i < n; i++) {
                if(arr[i]>0)
                {
                    sum+=arr[i];
                }

            }
            System.out.println(sum);
            t--;
        }
    }
}
