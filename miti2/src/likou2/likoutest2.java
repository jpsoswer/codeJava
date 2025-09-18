package likou2;

import java.util.ArrayList;
import java.util.Scanner;

public class likoutest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = scan.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < words.length; i++) {
            words[i] = scan.next();
        }
        String x = scan.next();
        char y = x.charAt(0);
        for (int i = 0; i < words.length; i++) {
            if(words[i].contains(y+""))
            {
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
