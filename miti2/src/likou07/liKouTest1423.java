package likou07;

import java.util.Scanner;

public class liKouTest1423 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] cardPoints = new int[n];
        for (int i = 0; i < cardPoints.length; i++) {
            cardPoints[i]= scan.nextInt();
        }
        int k = scan.nextInt();
        int i = maxScore(cardPoints, k);
        System.out.println(i);
    }
    public static int maxScore(int[] cardPoints, int k) {
        int count = 0;
        int ans = Integer.MAX_VALUE;
        int m = cardPoints.length - k;
        int sum = 0;
        for (int i = 0; i < cardPoints.length; i++) {
            sum+=cardPoints[i];
        }
        if(m==0)
        {
            return sum;
        }
        for (int i = 0; i < cardPoints.length; i++) {
            count+=cardPoints[i];
            int left = i-m+1;
            if(left<0)
            {
                continue;
            }
            ans = Math.min(ans,count);
            count-=cardPoints[left];
        }
        return sum-ans;
    }
    //9,7,7,9,7,7,9
}
