package test13;

import java.util.Arrays;
import java.util.Scanner;

public class testStringDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[][] str = new String[n][2];
        for (int i = 0; i < str.length; i++) {
            str[i][0] = scan.next();
            str[i][1] = scan.next();
        }
        for (int i = 0; i < n; i++) {
            int duicuo = 1;
            char[] charArray = str[i][0].toCharArray();
            char[] charArray1 = str[i][1].toCharArray();
            Arrays.sort(charArray);
            Arrays.sort(charArray1);
            int min = Math.min(charArray.length, charArray1.length);
            for (int j = 0; j < min; j++) {
                if(charArray[j]!=charArray1[j])
                {
                    duicuo=0;
                    break;
                }
            }
            if(duicuo == 1)
            {
                System.out.println("Y");
            }else {
                System.out.println("N");
            }
        }
    }
}
