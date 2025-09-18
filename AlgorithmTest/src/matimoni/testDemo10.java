package matimoni;

import java.util.Arrays;
import java.util.Scanner;

public class testDemo10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr,(o1,o2)->o2-o1);
        System.out.println(arr[k-1]);
    }
}
