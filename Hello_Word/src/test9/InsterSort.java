package test9;

import java.util.Scanner;

public class InsterSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scan.nextInt();
        }
        for(int i=1;i<arr.length;i++)
        {
            int j = i;
            int target = arr[i];
            while(j > 0 && arr[j-1] > target)
            {
                arr[j]= arr[j-1];
                j--;
            }
            if(j != i)
            {
                arr[j] = target;
            }
        }
        for(int x: arr)
        {
            System.out.print(x + " ");
        }
    }
}
