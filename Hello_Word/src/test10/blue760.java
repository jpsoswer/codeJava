package test10;
import java.util.Scanner;
public class blue760 {
    static int count = 1;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ziranNumber(n);
        System.out.println(count);
    }
    public static void ziranNumber(int n)
    {
        if (n == 1) {
            return;
        }
        for (int i = 1; i <= n/2; i++) {
            ziranNumber(i);
            count++;
        }
    }
}
