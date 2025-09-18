package test03.numberTest;

import java.util.Scanner;

public class numberDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =  scan.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i%3==0)
            {
                System.out.println("|");
                continue;
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
