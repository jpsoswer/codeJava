package test07.NumberTest;

import java.util.Scanner;

public class numberDemo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double c = scan.nextDouble();
        System.out.printf("%.2f C=%.2f F",c,c*(9.0/5)+32);
    }
}
