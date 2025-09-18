package test01.testNumber;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class testNumberDemo8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String two = scan.next();
        BigInteger bi = new BigInteger(two,2);
        System.out.println(bi);
    }
}
