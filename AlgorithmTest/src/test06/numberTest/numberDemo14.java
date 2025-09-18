package test06.numberTest;

import java.util.Scanner;

public class numberDemo14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double shang = scan.nextDouble();
        double xia = scan.nextDouble();
        double h = scan.nextDouble();
        System.out.printf("%.2f",((shang+xia)*h)/2);
    }
}
