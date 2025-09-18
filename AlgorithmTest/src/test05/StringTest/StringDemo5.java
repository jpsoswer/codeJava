package test05.StringTest;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String substring = s.substring(0, 3);
        System.out.println("   "+substring);
    }
}
