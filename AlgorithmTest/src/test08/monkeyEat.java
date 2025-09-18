package test08;

import java.util.Scanner;

public class monkeyEat {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int ans=1;
        int n= scan.nextInt();
        for (int i = 1; i < n; i++) {
            ans=(ans+1)*2;
        }
        System.out.println(ans);
    }
}
