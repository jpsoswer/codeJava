package likou01;

import java.util.HashMap;
import java.util.Scanner;

public class likou4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Character,Integer> hm = new HashMap<>();
        String s = scan.next();
        int stat=0;
        int end = 0;
        int ans = 0;
        for ( end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if(hm.containsKey(c))
            {
                stat = Math.max(stat,hm.get(c));
            }
            ans = Math.max(ans,end-stat+1);
            hm.put(c,end+1);
        }
        System.out.println(ans);
    }
}
