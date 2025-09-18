package test01.testNumber;

import java.util.Scanner;

public class testNumberDemo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int hour=0;
        int minutine=0;
        int miao=0;

        while (n>0) {
            if(n>=3600)
            {
                hour+=n/3600;
                n-=3600*hour;
            }else if (n>=60)
            {
                minutine+=n/60;
                n-=60*minutine;
            }else {
                miao+=n;
                n=0;
            }
        }
        System.out.println(hour+":"+minutine+":"+miao);
    }
}
