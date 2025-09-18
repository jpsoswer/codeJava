package test07.NumberTest;

import java.util.Scanner;

public class numberDemo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
        System.out.printf("%.2f公里=%.2f米",d,d*1000);
    }
}
