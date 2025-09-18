package test01.testString;

import java.util.Scanner;

public class testStringDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        System.out.println(sb);
    }
}
