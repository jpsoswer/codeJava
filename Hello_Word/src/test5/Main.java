package test5;

import java.util.*;

public class Main
{
  public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ans = 0;
        for (int i = 1; i <= n; ++i)
        {
            int t = i;
            boolean ok = false;
            while (t > 0)
            {
                int g = t % 10;
                if (g==2 || g==0 || g==1 || g==9)
                    ok = true;
                t = t / 10;
            }
            if (ok)
                ans += i;
        }
        System.out.println(ans);
    }
}