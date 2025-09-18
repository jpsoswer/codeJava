package test07.NumberTest;

import java.util.Scanner;

public class numberDemo12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        double he = a+b;
        System.out.printf("%.6f",he*(he-1));
    }
}
