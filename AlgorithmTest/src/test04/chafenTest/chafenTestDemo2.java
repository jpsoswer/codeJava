package test04.chafenTest;

import java.util.Scanner;

public class chafenTestDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long he = 0;
        long dx = 0;
        long dy = 0;
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            he += x*x+y*y;
            dx+=x;
            dy+=y;
        }
        System.out.println(he*n-dx*dx-dy*dy);
    }
}
