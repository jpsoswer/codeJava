package learnTest03;

import java.util.Scanner;

public class digui2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        hannio(n,'A','B','C');
    }

    public static void hannio(int n,char a,char b,char c)
    {
        if(n==1)
        {
            System.out.println(a+"-"+c);
        }
        else {
            hannio(n-1,a,c,b);
            System.out.println(a+"-"+c);
            hannio(n-1,b,a,c);
        }
    }
}
