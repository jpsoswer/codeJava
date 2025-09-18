package likou2;

import java.util.Scanner;

public class likoutest3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        String regex = "-";
        String[] split = s.split(regex);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            int x = Integer.parseInt(split[i]);
            String binaryString = Integer.toBinaryString(x);
            sb.append(binaryString);
            if(i!=split.length-1)
            {
                sb.append("-");
            }
        }
        System.out.println(sb);
    }
}
