package proticecode_2024_10_17;

import java.util.Arrays;
import java.util.Scanner;


public class TwoArrays {
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,10,14,17,20,26,29,35};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = Arrays.binarySearch(arr,n);

        int[] brr = new int[arr.length+1];

        if(i < 0)
        {

            int index = Math.abs(i+1);
            System.arraycopy(arr,0,brr,0,index);
            brr[index] = n;
            System.arraycopy(arr,index,brr,index+1,arr.length-index);
        }
        System.out.println(Arrays.toString(brr));
    }
}
