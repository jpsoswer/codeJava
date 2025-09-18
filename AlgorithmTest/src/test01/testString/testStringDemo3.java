package test01.testString;

import java.util.Scanner;

public class testStringDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        sb.append(charArray[0]);
        for (int i = 0; i < charArray.length; i++) {
            if(i%2!=0)
            {
                sb.append(charArray[i]);
            }
        }
        System.out.println(sb);
    }
}
