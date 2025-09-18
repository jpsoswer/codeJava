package test06.numberTest;

import java.util.Scanner;

public class numberDemo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println((int)Math.pow((x+y),3));
    }
}
