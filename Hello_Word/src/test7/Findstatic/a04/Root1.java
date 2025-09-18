package test7.Findstatic.a04;

import java.util.Scanner;

public class Root1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i=1;i<=x;i++)
        {
            if(i * i == x)
            {
                System.out.println(i);
                break;
            }
            else if(i * i < x && (i+2)*(i+2) > x)
            {
                System.out.println(i+1);
                break;
            }
        }
    }
}
