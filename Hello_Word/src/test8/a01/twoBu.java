package test8.a01;

import java.util.Arrays;
import java.util.Scanner;

public class twoBu {
    public static void main(String[] args) {
        int[] arr = {3,4,5,5,5,7,9,10,15};
        Scanner sc = new Scanner(System.in);
        int tagth = sc.nextInt();
        int i = Arrays.binarySearch(arr,tagth);
        int[] newArr = new int[arr.length+1];
        if(i < 0)
        {
            int index = Math.abs(i+1);
            System.arraycopy(arr,0,newArr,0,index);
            newArr[index] = tagth;
            System.arraycopy(arr,index,newArr,index+1,arr.length-index);
        }
        System.out.println(Arrays.toString(newArr));
    }
}
