package test12;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = scan.next();
        }
        Arrays.sort(arr,(o1,o2)->o2.length()-o1.length());
        for(String x: arr)
        {
            System.out.print(x + " ");
        }
    }
}
