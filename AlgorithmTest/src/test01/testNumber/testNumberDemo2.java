package test01.testNumber;

import java.util.Scanner;

public class testNumberDemo2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        if(a+b>c)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
