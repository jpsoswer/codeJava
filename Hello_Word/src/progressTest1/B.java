package progressTest1;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int count = 0;
        for (int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            while (c != 'a')
            {
                if(c>='m')
                {
                    c= (char) (c+1);
                }else {
                    c = (char) (c-1);
                }

                count++;
                if(c == 'z')
                {
                    c='a';
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
