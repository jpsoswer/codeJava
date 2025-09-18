package test14;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (n>0)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            //奇偶
            if((a%2!=0 && b%2==0) || (a%2==0 && b%2!=0))
            {
                System.out.println("YES");
            }
            //偶偶
            if(a%2==0 && b%2==0)
            {
                if(a==b)
                {
                    System.out.println("NO");
                }
                else {
                    System.out.println("YES");
                }
            }
            //奇奇
            if(a%2!=0 && b%2!=0)
            {
                System.out.println("NO");
            }
            n--;
        }
    }
}
