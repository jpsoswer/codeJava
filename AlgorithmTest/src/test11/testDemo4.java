package test11;

import java.util.Scanner;

public class testDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int n = s.length();
        int mind = n/2;
        int count=0;
        for (int i = 0; i < mind; i++) {
            if(s.charAt(i) != s.charAt(n-i-1))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
