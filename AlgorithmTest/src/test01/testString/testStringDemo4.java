package test01.testString;

import java.util.ArrayList;
import java.util.Scanner;

public class testStringDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String str = scan.next();

        ArrayList<Character> schar = new ArrayList<>();
        ArrayList<Character> strchar = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            schar.add(s.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            strchar.add(str.charAt(i));
        }
        int count=0;
        for (int i = 0; i < strchar.size(); i++) {
            for (int j = 0; j < schar.size(); j++) {
                if(schar.get(j)==strchar.get(i))
                {
                    schar.remove(j);
                    count++;
                    break;
                }
            }
        }
        if(count==str.length())
        {
            System.out.println("Lucky!");
        }
        else {
            System.out.println("QAQ Unlucky!");
        }

    }
}
