package test02.numberTest;

import java.util.Scanner;

public class numberTestDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(isNumberJi(n))
        {
            System.out.println("P");
        }
        else {
            if(n%2==0)
            {
                System.out.println("E");
            }
            else {
                System.out.println("O");
            }
        }
    }

    public static boolean isNumberJi(int n)
    {
        for (int i = 2; i < n; i++) {
            if( n%i==0)
            {
                return false;
            }
        }
        return true;
    }

}
