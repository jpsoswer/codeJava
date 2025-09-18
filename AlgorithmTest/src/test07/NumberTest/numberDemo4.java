package test07.NumberTest;

import java.util.Scanner;

public class numberDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();
        System.out.printf("%3d",(int)Math.cbrt(n));
    }
}
