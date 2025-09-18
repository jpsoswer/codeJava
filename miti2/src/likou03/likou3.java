package likou03;

import java.util.Scanner;

public class likou3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean strictlyPalindromic = isStrictlyPalindromic(n);

    }
    public static boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++) {
            if(!istrurandfal(i,n))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean istrurandfal(int i,int n)
    {
        int m = 0;
        int count = 0;
        while (n>0)
        {
            m+=(n%i)*(int)Math.pow(10,count);
            n/=i;
            count++;
        }
        String str = m+"";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if(str.equals(sb.reverse().toString()))
        {
            return true;
        }
        else {
            return false;
        }
    }
}
