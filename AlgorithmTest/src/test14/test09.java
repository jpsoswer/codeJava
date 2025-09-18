package test14;

import java.util.Scanner;

public class test09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int length = s.length();
        System.out.println(length*(length+1)/2);
    }
}
