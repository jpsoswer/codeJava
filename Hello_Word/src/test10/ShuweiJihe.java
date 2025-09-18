package test10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShuweiJihe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = n+"";
        int sum = 0;
        int sum1 = 1;
        for (int i = 0; i < s.length(); i++) {
            sum+=s.charAt(i)-'0';
            sum1*= (s.charAt(i)-'0');
        }
        System.out.println(sum1-sum);
    }
}
