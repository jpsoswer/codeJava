package test12;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pa = palou(scan.nextInt());
        System.out.println(pa);
    }
    public static int palou(int x)
    {
        if(x == 1)
        {
            return 1;
        }
        if(x==2)
        {
            return 2;
        }
        return palou(x-1)+palou(x-2);
    }
}
