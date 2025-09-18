package test06.numberTest;

import java.util.Scanner;

public class numberDemo13 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        double nei = scan.nextDouble();
        double wai = scan.nextDouble();
        System.out.printf("%.2f",(nei*wai)/2);
    }
}
