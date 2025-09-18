package test11;

import java.util.Scanner;

public class testDemo6 {
    static long sum=0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            number(arr[i]);
        }
        System.out.println(sum);
    }
    public static void number(int number)
    {
        while (number>0)
        {
            int i = number % 10;
            sum+=i;
            number/=10;
        }
    }
}
