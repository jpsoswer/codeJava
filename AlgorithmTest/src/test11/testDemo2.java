package test11;

import java.util.Scanner;

public class testDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long suma= 0;
        long sumb =0;
        for (int i = 0; i < n; i++) {
            suma+=scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sumb+=scan.nextInt();
        }
        if(suma%2==1 && sumb%2==1)
        {
            System.out.println("odd");
        }
        else {
            System.out.println("even");
        }
    }
}
