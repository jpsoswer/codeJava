package test01.testArray;

import java.util.Scanner;

public class testDemo6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt())
        {
            int a=scan.nextInt();
            int b= scan.nextInt();
            int c= scan.nextInt();
            System.out.println(a*b%c);
        }
    }
}
