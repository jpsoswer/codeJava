package likou2;

import java.util.Scanner;

public class likoutest4 {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        String s = scan.next();
        long sum=0;
        char[] charArray = s.toCharArray();
        int[] arr = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            arr[i] = charArray[i];
        }
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = Math.abs(arr[i+1]-arr[i]);
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
