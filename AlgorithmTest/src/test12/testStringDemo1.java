package test12;

import java.util.Scanner;

public class testStringDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int[] zimu = new int[30];
        int max = 0;
        int maxindex = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'A';
            zimu[index]++;
        }
        for (int i = 0; i < 30; i++) {
            if(zimu[i]>max)
            {
                max = zimu[i];
                maxindex = i;
            }
        }
        System.out.println((char) ('A'+maxindex));
    }
}
