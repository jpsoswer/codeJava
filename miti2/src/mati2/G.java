package mati2;

import java.util.Arrays;
import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLong();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int l = 0;
            int r = arr.length-1;
            while (l<=r)
            {
                int mind = (l+r)>>>1;
                if(arr[mind]>=arr[i])
                {
                    r = mind-1;
                }
                else {
                    l=mind+1;
                }
            }
            System.out.print(l+1+" ");
        }
    }
}
