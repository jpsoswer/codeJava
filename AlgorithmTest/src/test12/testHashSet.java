package test12;

import java.util.HashSet;
import java.util.Scanner;

public class testHashSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int count = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < x; i++) {
            hs.add(scan.nextInt());
        }
        int y = scan.nextInt();
        for (int i = 0; i < y; i++) {
            hs.add(scan.nextInt());
        }
        for (int i = 1; i <= n; i++) {
            for (Integer h : hs) {
                if(h==i)
                {
                    count++;
                    break;
                }
            }
        }

        if(count==n)
        {
            System.out.println("It Takes Two.");
        }else {
            System.out.println("Maybe Next Time.");
        }
    }
}
