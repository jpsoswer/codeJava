package test13;

import java.util.Scanner;

public class testNumberDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money = scan.nextInt();
        int n = scan.nextInt();
        int count = 1;
        while ((money*count)%10!=0 &&  (money*count)%10!=n)
            count++;
        System.out.println(count);
    }
}
