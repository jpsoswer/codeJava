package likou06;

import java.util.Scanner;

public class likoutest2379 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String blocks = scan.next();
        int k = scan.nextInt();
        int i = minimumRecolors(blocks, k);
        System.out.println(i);
    }
    public static int minimumRecolors(String blocks, int k) {
        char[] charArray = blocks.toCharArray();
        int count = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]=='W')
            {
                count++;
            }
            int left = i-k+1;
            if(left<0)
            {
                continue;
            }
            ans = Math.min(ans,count);
            if(charArray[left] == 'W')
            {
                count--;
            }
        }
        return ans;
    }

}
