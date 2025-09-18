package test9;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = scan.nextInt();
        }
        arr = quicksort(arr,0,n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] quicksort(int[] arr,int left,int right)
    {
        if(left < right)
        {
            int p = quickfen(arr,left,right);
            quicksort(arr,left,p-1);
            quicksort(arr,p+1,right);
        }
        return arr;
    }
    public static int quickfen(int[] arr,int left,int right)
    {
        int p = left;
        int index = p+1;
        for(int i = index;i<=right;i++)
        {
            if(arr[i] < arr[p])
            {
                swap(arr,i,index);
                index++;
            }

        }
        swap(arr,p,index-1);
        return index-1;
    }
    public static void swap(int[] arr,int a,int b)
    {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}
