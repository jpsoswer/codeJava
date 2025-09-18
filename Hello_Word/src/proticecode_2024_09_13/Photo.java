package proticecode_2024_09_13;

import java.util.Scanner;

public class Photo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i =0;i<n;i++)
        {
            for(int j = 0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k = 0;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i =0;i<n-1;i++)
        {
            for(int j = 0;j <= i+1;j++)
            {
                System.out.print(" ");
            }
            for(int k = 0;k<n-1-i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
