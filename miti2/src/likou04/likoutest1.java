package likou04;

import java.util.Scanner;

public class likoutest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        int i = maxVowels(s, k);
        System.out.println(i);
    }

    public static int maxVowels(String s, int k) {
        char[] charArray = s.toCharArray();
        int ans = 0;
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                count++;
            }
            int left = i-k+1;
            if(left<0)
            {
                continue;
            }
            ans = Math.max(ans,count);
            if(ans==k)
            {
                break;
            }
            char out = charArray[left];
            if(out == 'a' || out == 'e' || out == 'i' || out == 'o' || out == 'u')
            {
                count--;
            }
        }

        return ans;
    }
}
