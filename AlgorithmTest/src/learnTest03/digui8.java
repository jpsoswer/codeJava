package learnTest03;

import java.util.Scanner;

public class digui8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int f = f(n);
        System.out.println(f);
    }

    public static int f(int n)
    {
        //结束条件
        if(n==1 || n==0)
        {
            return n;
        }
        return f(n-1)+f(n-2);
    }
}
