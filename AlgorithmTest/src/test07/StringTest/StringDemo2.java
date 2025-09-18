package test07.StringTest;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int sum = n+m;
        if(sum >= 12)
        {
            System.out.printf("%3d",sum%12);
        }
        else {
            System.out.printf("%3d",sum);
        }
    }
}
