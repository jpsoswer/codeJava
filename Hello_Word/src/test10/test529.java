package test10;
import java.util.*;
public class test529 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        System.out.println(n);
    }
    public static int fei(int n)
    {
        if(n < 2)
        {
            return n;
        }
        int p = 0,r = 1,q  = 0;
        for (int i = 2; i < n; i++) {
            p = q;
            q = r;
            r = p+q;

        }
        return r;

    }

}
