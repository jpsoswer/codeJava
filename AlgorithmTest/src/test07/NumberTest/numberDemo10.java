package test07.NumberTest;

import java.util.Scanner;

public class numberDemo10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =  scan.nextInt();
        System.out.println((int)(0.5*n*n+0.5*n+1));
    }
}
