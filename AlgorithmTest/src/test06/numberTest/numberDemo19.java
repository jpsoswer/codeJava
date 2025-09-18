package test06.numberTest;

import java.util.Scanner;

public class numberDemo19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean ma = true;
        while (n!=0)
        {
            int i = n % 10;
            if(i!=7 && i!=4)
            {
                ma=false;
                break;
            }
            n/=10;
        }
        if(ma)
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
