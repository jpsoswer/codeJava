package likou01;

import java.util.Scanner;

public class likou5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s=n+"";
        StringBuilder sb = new StringBuilder();
        if (n<0)
        {
            int i = Integer.parseInt(sb.append(s.substring(1)).reverse()
                    .toString());
            System.out.println(-i);
        }
        else {
            int i = Integer.parseInt(sb.append(s).reverse()
                    .toString());
            System.out.println(i);
        }


    }
}
