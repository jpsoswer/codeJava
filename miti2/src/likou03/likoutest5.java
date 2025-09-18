package likou03;

import java.util.Scanner;

public class likoutest5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] s = new char[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = scan.next().charAt(0);
        }
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int l = 0;
        int r = s.length-1;
        for (int i = 0; i < s.length / 2; i++) {
            char c = s[l];
            s[l] = s[r];
            s[r] = c;
            l++;
            r--;
        }
        System.out.println(s);
    }
}
