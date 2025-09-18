package test07.StringTest;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int sum = n+m;
        if(sum%12==0)
        {
            System.out.println("  0");
        }
        else if(sum>12){
            int cha = sum-12;
            if((cha+"").length()==1)
            {
                System.out.println("  "+cha);
            }
            else {
                System.out.println(" "+cha);
            }

        }
        else {
            int cha = sum;
            if((cha+"").length()==1)
            {
                System.out.println("  "+cha);
            }
            else {
                System.out.println(" "+cha);
            }
            System.out.println();
        }
    }
}
