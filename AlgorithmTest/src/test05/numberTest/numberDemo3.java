package test05.numberTest;

import java.util.Scanner;

public class numberDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        System.out.printf("%.6f",a+b+c);
        System.out.println();
        System.out.printf("%.6f",(a+b+c)/3);
    }
}
