package test05.numberTest;

import java.util.Scanner;

public class numberDemo5 {
    //(1/2)∗(a∗x+(a+x)/(4∗a))
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int x = scan.nextInt();
        System.out.printf("%.2f",(1.0/2)*(a*x+(a+x)/(4.0*a)));
    }
}
