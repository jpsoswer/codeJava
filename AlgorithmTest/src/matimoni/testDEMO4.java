package matimoni;

import java.util.Scanner;

public class testDEMO4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum=0;
        int[][] arr = new int[n][2];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
            sum+=arr[i][0];
        }
        System.out.println(sum);
    }
}
