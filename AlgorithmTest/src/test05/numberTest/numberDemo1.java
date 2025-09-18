package test05.numberTest;

import java.util.Scanner;

public class numberDemo1 {
    public static void main(String[] args) {
        Scanner scan  =new Scanner(System.in);
        String  s = scan.next();
        String[] split = s.split(",");

        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        System.out.println(n+"+"+m+"="+(n+m));
        System.out.println(n+"-"+m+"="+(n-m));
    }
}
