package test14;

import java.util.Arrays;
import java.util.Scanner;

public class test13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] brr = new Integer[100010];
        Arrays.fill(brr,0);
        for (int i = 0; i < 5; i++) {
            int n = scan.nextInt();
            brr[n]++;
        }
        Arrays.sort(brr,(o1,o2)->o2-o1);
        if(brr[0]==4)
        {
            System.out.println("Square");
        }
        else if(brr[0]==2&&brr[1]==2)
        {
            System.out.println("Rectangle");
        }
        else {
            System.out.println("No");
        }
    }
}
