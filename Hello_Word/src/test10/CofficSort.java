package test10;

import java.util.Scanner;

public class CofficSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        int[] zeng = new int[m];
        for (int i = 0; i < zeng.length; i++) {
            zeng[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int count = 0;
        int age = 0;
        for (int i = 0; i < zeng.length; i++) {
            for (int j = 0;j<arr.length;j++)
            {
                int x = 0;
                x = j-zeng[i];
                if(x < 0)
                    continue;
                age++;
                if (arr[j] < arr[x])
                {
                    count++;
                    int t = arr[j];
                    arr[j] = arr[x];
                    arr[x] = t;
                }
            }
        }
        System.out.println(age + " " + count);
    }
}
