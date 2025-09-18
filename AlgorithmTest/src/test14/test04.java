package test14;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int first = arr[0];
        if(first==1)
        {
            zhi(1,arr);
        }
        else {
            zhi(0,arr);
        }
    }
    public static void zhi(int ans,int[] arr)
    {
        int sum=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==ans)
            {
                break;
            }
            ans = arr[i];
            sum++;
        }
        System.out.println(sum);
    }
}
