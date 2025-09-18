package mati2;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        long count=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
