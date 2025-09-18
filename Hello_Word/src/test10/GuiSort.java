package test10;

import java.util.Scanner;

public class GuiSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        arr = guisort(arr,0,n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] guisort(int[] arr,int l,int r)
    {
        if(l == r)
        {
            return new int[]{arr[l]};
        }
        int mind = (l+r) >>> 1;
        int[] leftArr = guisort(arr,l,mind);
        int[] rightArr = guisort(arr,mind+1,r);
        int[] nums = new int[leftArr.length+rightArr.length];
        int m = 0,le = 0,ri = 0;
        while(le<leftArr.length && ri < rightArr.length)
        {
            nums[m++] = leftArr[le] < rightArr[ri] ? leftArr[le++] : rightArr[ri++];
        }
        while(le < leftArr.length)
        {
            nums[m++] = leftArr[le++];
        }
        while(ri < rightArr.length)
        {
            nums[m++] = rightArr[ri++];
        }
        return nums;
    }
}
