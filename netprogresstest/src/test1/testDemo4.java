package test1;

import java.util.Scanner;

public class testDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count=0;
        for (int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(c>='A' && c<='Z')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
