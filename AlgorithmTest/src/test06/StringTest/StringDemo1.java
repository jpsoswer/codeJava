package test06.StringTest;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++)
        {
            sb.append(s.charAt(i));
        }
        sb.reverse();
        System.out.println(sb.toString());
    }
}
