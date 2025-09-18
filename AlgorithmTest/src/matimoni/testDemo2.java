package matimoni;

import java.util.Scanner;

public class testDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum=0;
        for (int i = 1; i <=n; i++) {
            if(i%7!=0 && !check(i))
            {
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    public static boolean check(int shu)
    {
        while (shu!=0)
        {
            int i = shu % 10;
            if(i==7)
            {
                return true;
            }
            shu/=10;
        }
        return false;
    }
}
