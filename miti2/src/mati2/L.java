package mati2;

import java.util.HashMap;
import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String,Integer> hm = new HashMap<>();
        int n = scan.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scan.next();
            if(hm.containsKey(strings[i]))
            {
                hm.put(strings[i],hm.get(strings[i])+1);
            }
            else {
                hm.put(strings[i],0);
            }
        }

        int m = scan.nextInt();

        for (int i = 0; i < m; i++) {
            int l = scan.nextInt();
            if(l==1)
            {
                String s = scan.next();
                int number = scan.nextInt();
                if(hm.containsKey(s))
                {
                    hm.put(s,hm.get(s)+number);
                }
            }
            else if(l==2){
                String s = scan.next();
                if(hm.containsKey(s))
                {
                    System.out.println(hm.get(s));
                }
                else {
                    System.out.println(-1);
                }
            }
        }

    }
}
