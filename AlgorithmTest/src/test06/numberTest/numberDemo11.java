package test06.numberTest;

import java.util.Scanner;

public class numberDemo11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float f = scan.nextFloat();
        float d = scan.nextFloat();
        System.out.printf("Area=%.2f",(f*d)/2);
    }
}
