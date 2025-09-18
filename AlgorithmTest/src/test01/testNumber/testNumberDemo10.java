package test01.testNumber;

import java.util.Scanner;

public class testNumberDemo10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long b = scan.nextInt();
        long c = scan.nextInt();
        long d = scan.nextInt();

        long l = Math.min(a, c) + Math.min(b, d);

        System.out.println(l);
    }
}
