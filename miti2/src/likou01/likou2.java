package likou01;

import java.util.HashSet;
import java.util.Scanner;

public class likou2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            hs.add(s.charAt(i));
        }
        int size = hs.size();
        System.out.println(size);
    }
}
