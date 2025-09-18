package test12;

import java.util.Scanner;

//猴子吃桃桃
public class C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int avg = eat(n);
        System.out.println(avg);
    }

    public static int eat(int x)
    {
        if(x <=0 || x>=11)
        {
            System.out.println("error!");
            return -1;
        }
        if(x == 10)
        {
            return 1;
        }
        return (eat(x+1) + 1)*2;
    }
}
