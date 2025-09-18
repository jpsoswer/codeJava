package test11;

import java.util.Scanner;
import java.util.Vector;

public class Vec {
    public static void main(String[] args) {
        Vector v = new Vector();
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            Integer value = scanner.nextInt();
            if(value == -1)
            {
                break;
            }
            v.addElement(value);
        }
        Integer sd = (Integer) v.elementAt(0);
        int s = Integer.valueOf(sd);
        int k = s;
        System.out.println(k);
    }
}
