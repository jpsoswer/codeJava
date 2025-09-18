package test01.testNumber;

import java.util.Scanner;

public class testNumberDemo11 {

    static boolean check(int number)
    {
        while (number!=0)
        {
            int i = number % 10;
            if(i==7)
            {
                return false;
            }
            number/=10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum=0;
        for (int i = 1; i <= n; i++) {
            if(i%7!=0 && check(i))
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
