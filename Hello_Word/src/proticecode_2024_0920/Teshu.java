package proticecode_2024_0920;

import java.util.Scanner;

public class Teshu {
    public static int Teshushu(int n)
    {
        int j = 0;
        int a = 0;
        for(int i = 1;i<=n;i++)
        {
            j = i;
            while(j != 0)
            {
                j/=10;
                a++;
            }

        }
        return n;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
    }
}
