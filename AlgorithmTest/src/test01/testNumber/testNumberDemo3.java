package test01.testNumber;

import java.util.Scanner;

public class testNumberDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count=0;
        for (int i = 11; i <= n; i++) {
            int shu = i;
            int ans=0;
            while (shu!=0)
            {
                ans+=shu%10;
                shu/=10;
            }
            if(ans==10)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
