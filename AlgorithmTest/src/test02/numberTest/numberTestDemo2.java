package test02.numberTest;

import java.util.Scanner;

public class numberTestDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] split = s.split(",");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        long sum  = 0;
        for (int i = n; i <= m; i++) {
            if(i%2==0 && i%3==0)
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
