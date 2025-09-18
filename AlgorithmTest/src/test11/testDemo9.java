package test11;

import java.util.Scanner;
//matiji
public class testDemo9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count = 0;
        String target = "matiji";
        for (int i = 0,j=6; i <s.length() && j<=s.length(); i++,j++) {
            if(s.substring(i,j).equals(target))
            {
                count++;
            }
        }
        System.out.println(count);

    }
}
