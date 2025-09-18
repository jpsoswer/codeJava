package test06.numberTest;

import java.util.Scanner;

public class numberDemo10 {
    static final double PI = 3.1415926;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double v = scan.nextDouble();
        double c = scan.nextDouble();
        System.out.printf("Area = %.6f",PI*v*c);
    }
}
