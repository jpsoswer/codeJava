package test12;

import java.util.Arrays;
import java.util.Scanner;

public class Stest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] ssum = new String[n];
        for(int i=0;i<ssum.length;i++)
        {
            ssum[i]= scan.next();
        }
        Arrays.sort(ssum,(o1,o2)->o1.compareTo(o2));
        for(String x:ssum)
        {
            System.out.println(x);
        }
    }
}
