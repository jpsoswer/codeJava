package test01.testNumber;

import java.util.Scanner;

public class testNumberDemo1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int n = scan.nextInt();
        int a=2,b=0;
        while ((a*=2) < n);

        b=a/2;
        int number = a - n > n - b ? b : a;
        System.out.println(number);
    }
}
