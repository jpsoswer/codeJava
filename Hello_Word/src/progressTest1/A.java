package progressTest1;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double a = 0.0;
        if(n >= 5000)
        {
            a = n*0.6;
        } else if (n >= 2000) {
            a = n*0.7;
        } else if (n >= 500) {
            a = n*0.8;
        } else if (n >= 100) {
            a = n*0.9;
        }
        System.out.println(a);
    }
}
