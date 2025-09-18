package likou2;

import java.util.Scanner;

public class likoutest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] charArray = s.toCharArray();
        int max = 0;
        int ans = 0;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]=='E')
            {
                ans++;
            }
            else {
                ans--;
            }
            max= Math.max(max,ans);
        }
        System.out.println(max);
    }
}
