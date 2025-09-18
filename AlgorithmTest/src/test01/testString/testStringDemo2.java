package test01.testString;

import java.util.Scanner;

public class testStringDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String[] split = s.split("=")[0].split("\\*");
        int number = Integer.parseInt(split[0]) * Integer.parseInt(split[1]);
        System.out.println(number);
    }
}
