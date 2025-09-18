package test01.testNumber;

import java.util.Scanner;

public class testNumberDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int  j=0;j<n;j++)
            {
                System.out.print(j+1 +" ");
            }
            System.out.println();
        }
    }
}
