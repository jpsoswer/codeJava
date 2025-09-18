package test06.numberTest;

import java.util.Scanner;
//R=(C*C+4*H*H)/8H
public class numberDemo18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double c= scan.nextDouble();
        double h= scan.nextDouble();
        System.out.printf("%.2f",(c*c+4*h*h)/(8*h));
    }
}
