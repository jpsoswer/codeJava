package learnTest03;

import java.util.Scanner;

public class digui3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int digui = digui(n);
        System.out.println(digui);
    }

    public static int digui(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        return n*digui(n-1);
    }
}
