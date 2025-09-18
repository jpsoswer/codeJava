package learnTest03;

import java.util.Scanner;

//兔子问题
public class digui9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int digui = digui(n);
        System.out.println(digui);
    }

    public static int digui(int n)
    {
        if(n==1 || n==0)
        {
            return n;
        }
        return digui(n-1)+digui(n-2);
    }
}
