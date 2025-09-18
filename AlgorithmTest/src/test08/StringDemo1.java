package test08;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        if(s.length()<n)
        {
            s+=scan.nextLine();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(s.charAt(i));
        }
    }
}
