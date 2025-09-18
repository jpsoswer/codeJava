package test05.numberTest;

import java.util.Scanner;

public class numberDemo4 {
    static final double PI = 3.1415926;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double h = scan.nextDouble();

        //圆周长
        System.out.printf("%.2f",2*PI*r);
        System.out.println();
        //圆面积
        System.out.printf("%.2f",PI*r*r);
        System.out.println();
        //球面积
        System.out.printf("%.2f",4*PI*r*r);
        System.out.println();
        //球体积
        System.out.printf("%.2f",4.0/3*PI*r*r*r);
        System.out.println();
        //圆柱体积
        System.out.printf("%.2f",PI*r*r*h);

    }
}
