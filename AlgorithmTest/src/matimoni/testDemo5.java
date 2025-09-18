package matimoni;

import java.util.Scanner;

public class testDemo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int max = Math.max(n, m);

        System.out.println(max*max-n*m);
    }
}
