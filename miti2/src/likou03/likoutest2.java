package likou03;

import java.util.Scanner;

public class likoutest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < height.length; i++) {
            height[i] = scan.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int l = 0,r= height.length-1;
        while (l<r)
        {
            int s = 0;
            if(height[l]>height[r])
            {
                s = height[r]*(r-l);
                r--;
            }
            else {
                s = height[l]*(r-l);
                l++;
            }
            max = Math.max(s,max);
        }
        System.out.println(max);
    }
    //1,8,6,2,5,4,8,3,7
}
