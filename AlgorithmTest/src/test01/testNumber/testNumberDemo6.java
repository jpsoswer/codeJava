package test01.testNumber;

import java.util.Scanner;

public class testNumberDemo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chang=scan.nextInt();
        int kuan = scan.nextInt();
        int max = Math.max(chang, kuan);
        System.out.println(max*max-chang*kuan);
    }
}
