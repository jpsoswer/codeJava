package test03;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class numberDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        long sum=0;
        for (int i = a; i <= b; i++) {
            if(i%8!=0)
            {
                sum+=(i*(i+1))/2;
            }
        }
        System.out.println(sum);
    }
}
