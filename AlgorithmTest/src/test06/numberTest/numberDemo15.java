package test06.numberTest;

import java.util.Scanner;
//S=1/2 * |x1y2+x2y3+x3y1-x1y3-x2y1-x3y2|
public class numberDemo15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        System.out.printf("%.2f",1.0/2*Math.abs(x1*y2+x2*y3 + x3*y1 - x1*y3 -x2*y1 - x3*y2));
    }
}
