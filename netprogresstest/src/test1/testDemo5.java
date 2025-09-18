package test1;

import java.util.Arrays;
import java.util.Scanner;

public class testDemo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int[] arr = new int[26];
        for (int i = 0; i <s.length(); i++) {
            char c = s.charAt(i);
            int shu = c - 'a';
            arr[shu]++;
        }
        int max=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[max])
            {
                max=i;
            }
        }
        System.out.println((char) ('a'+max));
    }
}
