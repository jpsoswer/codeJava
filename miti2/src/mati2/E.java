package mati2;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = scan.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scan.next();
        }
        int[] arr = new int[30];
        for (int i = 0; i < s.length(); i++) {
            int k = s.charAt(i)-'a';
            arr[k]++;
        }
        int[][] brr = new int[n][30];
        for (int i = 0; i < n; i++) {
            String str = strings[i];
            for (int j = 0; j < str.length(); j++) {
                int k = str.charAt(j)-'a';
                brr[i][k]++;
            }
        }
        for (int i = 0; i < n; i++) {
            int count=0;
            for (int j = 0; j < brr[i].length; j++) {
                if(arr[j]>=brr[i][j])
                {
                    count++;
                }
            }
            if(count==30)
            {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }
}
