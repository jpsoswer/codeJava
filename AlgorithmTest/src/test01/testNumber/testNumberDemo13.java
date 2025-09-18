package test01.testNumber;

import java.util.Scanner;

public class testNumberDemo13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i=0;i<=n/2;i++)
        {
            System.out.println(n+"="+i+"+"+(n-i));
        }
    }
}
