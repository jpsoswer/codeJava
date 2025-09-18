package test01.testArray;

import java.util.Arrays;
import java.util.Scanner;

public class testArrayDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] =scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}
