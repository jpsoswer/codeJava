package test05.StringTest;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        for (int i = 1; i <= 3; i++) {
            String str = "";
            for (int j = (i-1)*3; j <i*3; j++) {
                str+=s.charAt(j);
            }
            System.out.print(str+" ");
        }
    }
}
