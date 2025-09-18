package test01.testNumber;

import java.util.Scanner;

public class testNumberDemo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l=scan.nextInt();
        int r=scan.nextInt();
        int count=0;
        for (int i = l; i <= r; i++) {
            int number=i;
            while (number!=0)
            {
                int i1 = number % 10;
                if(i1==2)
                {
                    count++;
                }
                number/=10;
            }
        }
        System.out.println(count);
    }
}
