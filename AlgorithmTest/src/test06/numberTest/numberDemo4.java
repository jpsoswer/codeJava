package test06.numberTest;

import java.util.Scanner;

public class numberDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(c+(b*10)+(a*100));
    }
}
