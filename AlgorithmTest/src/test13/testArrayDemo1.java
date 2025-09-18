package test13;

import java.util.Scanner;
/*
a,m,n,k,t1,t2
 */
public class testArrayDemo1 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int a = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();
        int k = scan.nextInt();
        int t1 = scan.nextInt();
        int t2 = scan.nextInt();
        int tmp = -1;
        int idea = 0;
        int sum = 0;
        while (a!=0)
        {
            int l = scan.nextInt();
            int r = scan.nextInt();
            idea = l-tmp;
            if(tmp != -1)
            {
                if(idea < t1)
                {
                    sum+=idea*m;
                } else if (idea < t1 + t2) {
                    sum+= t1*m+(idea-t1)*n;
                } else {
                    sum+= t1*m+t2*n+(idea-t1-t2)*k;
                }
            }
            sum+=(r-l)*m;
            tmp = r;
            a--;
        }
        System.out.println(sum);
    }
}
