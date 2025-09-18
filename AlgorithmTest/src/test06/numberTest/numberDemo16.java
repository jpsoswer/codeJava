package test06.numberTest;

import java.util.Scanner;

public class numberDemo16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int z1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int z2 = scan.nextInt();
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();
        int z3 = scan.nextInt();

        double ab = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)+Math.pow(z1-z2,2));
        double ac = Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2)+Math.pow(z1-z3,2));
        double bc = Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2)+Math.pow(z3-z2,2));

        double p = (ab+ac+bc)/2;

        double s = Math.sqrt(p*(p-ab)*(p-ac)*(p-bc));
        System.out.printf("%.2f",s);
    }
}
