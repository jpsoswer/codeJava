package test07.NumberTest;

import java.util.Scanner;

public class numberDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
        System.out.printf("%.2f ",Math.sqrt(d));
        System.out.printf("%.2f ",Math.log(d));
        System.out.printf("%.2f ",Math.log10(d));

    }
}
