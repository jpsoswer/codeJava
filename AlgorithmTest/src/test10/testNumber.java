package test10;

import java.util.Scanner;

//13千克、7千克、3千克、1千克的沙子。
public class testNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count=0;
        while (n>0)
        {
            if(n>=13)
            {
                n-=13;
            } else if (n>=7) {
                n-=7;
            } else if (n>=3) {
                n-=3;
            } else if (n>=1) {
                n-=1;
            }
            count++;
        }
        System.out.println(count);

    }
}
