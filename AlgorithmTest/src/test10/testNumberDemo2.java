package test10;

import java.util.Scanner;

public class testNumberDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int f=0;
        int b = 0;
        int fb = 0;
        for (int i = 1; i <= n; i++) {
            if(f(i))
            {
                f++;
            }
            if(b(i))
            {
                b++;
            }
            if(f(i) && b(i))
            {
                fb++;
            }
        }
        System.out.println(f-fb);
        System.out.println(b-fb);
        System.out.println(fb);

    }
    public static boolean shuwei(int  number,int shu)
    {
        while (number > 0)
        {
            int i = number % 10;
            if(i==shu)
            {
                return true;
            }
            number /= 10;
        }
        return false;
    }
    public static boolean f(int number)
    {
        if(number % 3==0 || shuwei(number,3))
        {
            return true;
        }
        return false;
    }
    public static boolean b(int number)
    {
        if(number % 5==0 || shuwei(number,5))
        {
            return true;
        }
        return false;
    }
}
