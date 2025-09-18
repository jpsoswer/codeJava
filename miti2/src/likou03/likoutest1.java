package likou03;

import java.util.Scanner;

public class likoutest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] charArray = s.toCharArray();
        int c=0;
        int j = charArray.length-1;
        if(charArray[0]=='-')
        {
            c=1;
        }
        for (int i = 0; i <charArray.length/2; i++) {
            char t = charArray[c];
            charArray[c++] = charArray[j];
            charArray[j--] = t;
        }
        String str = new String(charArray);

    }
}
