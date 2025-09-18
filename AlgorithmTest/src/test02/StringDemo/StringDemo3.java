package test02.StringDemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = n+"";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        sb.reverse();
        String string = sb.toString();
        int i = Integer.parseInt(string);

        System.out.println(i);
        if(n>i)
        {
            System.out.println("False");
        }
        else if(n<i){
            System.out.println("True");
        }
    }
}
