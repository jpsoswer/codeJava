package test05.StringTest;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String[] split = s.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.print(split[i].split("=")[1]+" ");
        }
    }
}
