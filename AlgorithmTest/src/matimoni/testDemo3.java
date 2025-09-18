package matimoni;

import java.util.Scanner;

public class testDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s =  scan.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for (int i = 1; i <s.length(); i++) {
            if(i%2!=0)
            {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
