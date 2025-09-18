package test01.testString;
import java.util.*;
class d {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String S = input.next();
        String T = input.next();
        int s = 0;
        int t = 0;
        int count = 0;
        int index = -1;
        for (int i = 0; i < T.length(); i++) {
            for (int j = index + 1; j < S.length(); j++) {
                index++;
                if (S.charAt(j) == T.charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        if(count == T.length()) {
            System.out.println("Lucky!");
        } else {
            System.out.println("QAQ Unlucky!");
        }
    }

}