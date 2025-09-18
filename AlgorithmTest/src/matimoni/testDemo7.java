package matimoni;

import java.util.Scanner;

public class testDemo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double k = scan.nextDouble();
        if((a+b)>=k)
        {
            System.out.println("You have slain an enemy");
        }
        else {
            System.out.println("You have been slain");
        }
    }
}
