package test3;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] sr = s.toCharArray();
        int count =0;
        for(int i=sr.length-1;i>=0;i--)
        {
            if(sr[i] == ' ')
            {
                break;
            }
            else{
                count++;
            }
        }
        System.out.println(count);

    }
}
