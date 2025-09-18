package test06.numberTest;

import java.util.Scanner;

public class numberDemo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chang = scanner.nextDouble();
        double kuan = scanner.nextDouble();
        System.out.printf("Area=%.6f",chang*kuan);
        System.out.println();
        System.out.printf("Perimeter=%.6f",2*(chang+kuan));
    }
}
