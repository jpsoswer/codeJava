package test05.numberTest;

import java.util.Scanner;

public class numberDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.printf("%.6f*%.6f=%.6f",a,b,a*b);
        System.out.println();
        System.out.printf("%.6f/%.6f=%.6f",a,b,a/b);
    }
}
