package test06.numberTest;

import java.util.Scanner;
//
//Area=78.539815
//Circumference=31.415926
public class numberDemo8 {
    static final double PI=3.1415926;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        System.out.printf("Area=%.6f",PI*r*r);
        System.out.println();
        System.out.printf("Circumference=%.6f",2*PI*r);
    }
}
