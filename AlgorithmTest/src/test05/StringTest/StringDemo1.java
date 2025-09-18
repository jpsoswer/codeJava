package test05.StringTest;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String[] split = s.split(",");
        char a = split[0].charAt(0);
        char b = split[1].charAt(0);
        System.out.println("The ASCII code of "+a+" is "+(int)a+"");
        System.out.println("The ASCII code of "+b+" is "+(int)b+"");

    }
}
