package test5;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int sum =0;

        for(int i=1;i<=n;i++)
        {
            int j = i;

            while(j != 0)
            {
                int index = j%10;
                if(index == 2 ||index == 0 ||index == 1 ||index == 9)
                {
                    sum+=i;
                    break;
                }
                j/=10;
            }
        }
        System.out.println(sum);
    }
}
