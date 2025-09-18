package test02.numberTest;

import java.util.Scanner;

public class numberTestDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%10==0)
        {
            n=0;
        }
        else {
            n*=2;
        }
        System.out.println(n);
    }
}
