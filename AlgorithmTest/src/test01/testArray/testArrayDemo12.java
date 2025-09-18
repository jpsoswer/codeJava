package test01.testArray;

import java.util.Arrays;
import java.util.Scanner;

public class testArrayDemo12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr,(o1,o2)->o2-o1);
        System.out.println(arr[m-1]);
    }
}
