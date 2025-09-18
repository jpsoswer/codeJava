package test03.ArrayTest;

import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean br = scan.next().replaceAll("!","").contains(scan.next());
        if(br)
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
}
