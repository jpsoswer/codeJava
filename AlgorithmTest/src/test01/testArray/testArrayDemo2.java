package test01.testArray;

import java.util.Arrays;
import java.util.Scanner;

public class testArrayDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        if(arr[1]-arr[0]==1&&arr[2]-arr[1]==1)
        {
            System.out.println("TRUE");
        }
        else {
            System.out.println("FALSE");
        }
    }
}
