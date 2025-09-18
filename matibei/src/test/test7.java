package test;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int sum = (a+b)*2;
            if(sum%4==0)
            {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
