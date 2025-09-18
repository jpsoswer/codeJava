package test03.ArrayTest;

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int k  = scan.nextInt();
        String s = scan.next();
        char[] charArray = s.toCharArray();
        int index=0;
        while (index<=charArray.length-1)
        {
            System.out.print(charArray[index]);
            index+=k;
        }
    }
}
