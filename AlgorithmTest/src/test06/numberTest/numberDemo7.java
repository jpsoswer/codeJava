package test06.numberTest;

import java.util.Scanner;

public class numberDemo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = scanner.nextDouble();
        System.out.printf("%.6f", Math.abs(v));
    }
}
