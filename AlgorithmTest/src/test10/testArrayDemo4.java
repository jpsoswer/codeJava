package test10;

import java.util.Scanner;

public class testArrayDemo4 {
    static final int day = 1440;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int gametime = scan.nextInt();
        int[] dayarr = new int[n];
        for (int i = 0; i < dayarr.length; i++) {
            dayarr[i]=scan.nextInt();
        }
        int count = 0;
        for (int i = 0; i < dayarr.length; i++) {
            int shengTime = day-dayarr[i];
            if(shengTime>=60)
            {
                gametime-=shengTime;
                if(gametime<=0)
                {
                    count++;
                    break;

                }
            }
            count++;
        }
        System.out.println(count);
    }
}
