package learnTest03;

import java.util.Scanner;

//冒泡排序
public class sort1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        int[] arr1 = sortArray(arr);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    private static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j <arr.length; j++) {
                if(arr[i] > arr[j])
                {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        return arr;
    }
}
