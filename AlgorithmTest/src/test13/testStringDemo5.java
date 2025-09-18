package test13;

import java.util.Scanner;

public class testStringDemo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int length = s.length();
        if(length%2==0)
        {
            String substring = s.substring(s.length() / 2);
            StringBuilder sb = new StringBuilder();
            String string = sb.append(substring).reverse().toString();
            System.out.println(s.substring(0,s.length()/2)+string);
        }
        else {
            System.out.println("123456");
        }
    }
}
