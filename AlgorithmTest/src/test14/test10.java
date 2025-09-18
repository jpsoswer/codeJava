package test14;

import java.util.HashSet;
import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = s.length();
        HashSet<String> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                String substring = s.substring(i, j);
                hs.add(substring);
            }
        }
        System.out.println(hs.size());
    }
}
