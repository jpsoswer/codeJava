package mati2;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n!=0 && n%3==0)
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
