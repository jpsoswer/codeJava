package test10;

import java.util.ArrayList;
import java.util.Scanner;

public class testArrayDemo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < strs.length; i++) {
            strs[i]=scan.next();
        }
        String[][] strss = new String[n][n];
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strss.length; i++) {
            for (int i1 = 0; i1 < strss[i].length; i1++) {
                strss[i][i1] = strs[i].charAt(i1)+"";
            }
            arr.add(strss[i][i]);
        }
        long count = arr.stream().distinct().count();
        if(count == n)
        {
            System.out.println("accept");
        }
        else {
            System.out.println("refuse");
        }

    }
}
