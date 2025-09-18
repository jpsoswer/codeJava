package test13;

import java.math.BigInteger;
import java.util.Scanner;

public class testNumberDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        BigInteger[] arr = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextBigInteger();
        }
        BigInteger lcm = BigInteger.ONE;
        for (int i = 0; i < n; i++) {
            BigInteger gcd = lcm.gcd(arr[i]);
            lcm = lcm.multiply(arr[i]).divide(gcd);
        }
        System.out.println(lcm.mod(BigInteger.valueOf(998244353)));
    }
}
