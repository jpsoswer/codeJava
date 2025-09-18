package test;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int length = s.length();
        int count=0;
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                count++;
            }
        }
        System.out.println(count+length);
    }
}
