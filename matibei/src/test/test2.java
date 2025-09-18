package test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 1;
        for (int i = 0; i < n; i++) {
            int number = scan.nextInt();
            sum=sum*number;
        }
        System.out.println(sum%998244353);
    }
}
