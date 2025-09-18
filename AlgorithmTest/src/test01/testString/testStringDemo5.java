package test01.testString;

import java.util.Scanner;

public class testStringDemo5 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String D = scan.next();
        String T = scan.next();

        int count=0;
        int index=-1;

        for (int i = 0; i < T.length(); i++) {

            for (int j = index+1; j <D.length(); j++) {
                index++;
                if(T.charAt(i) == D.charAt(j))
                {
                    count++;
                    break;
                }
            }
        }

        if(count==T.length())
        {
            System.out.println("Lucky!");
        }
        else {
            System.out.println("QAQ Unlucky!");
        }
    }
}
