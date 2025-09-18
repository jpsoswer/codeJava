package test07.NumberTest;

import java.util.Scanner;
//4n–2（n+1）–1
public class numberDemo8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(4*n-2*(n+1)-1);
    }
}
