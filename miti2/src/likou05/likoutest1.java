package likou05;

import java.util.Scanner;

public class likoutest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int threshold = scan.nextInt();
        int i = numOfSubarrays(arr, k, threshold);
        System.out.println(i);
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count+=arr[i];
            int left = i-k+1;
            if(left<0)
            {
                continue;
            }
            if(count/k>threshold)
            {
                ans++;
            }
            count-= arr[left];
        }
        return ans;
    }
}
