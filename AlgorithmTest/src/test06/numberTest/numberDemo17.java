package test06.numberTest;

import java.util.Scanner;

//C=2∗
//H∗(2∗R−H)
public class numberDemo17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r= scan.nextDouble();
        double h= scan.nextDouble();
        System.out.printf("%.2f",2*Math.sqrt(h*(2*r-h)));
    }
}
