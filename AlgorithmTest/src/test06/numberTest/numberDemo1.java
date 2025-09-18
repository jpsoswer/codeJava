package test06.numberTest;

import java.util.Scanner;

public class numberDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double f = scan.nextDouble();
        System.out.printf("%.6f ",f);
        System.out.printf("%.2f ",f);
        System.out.printf("%8f",f);
    }
}
