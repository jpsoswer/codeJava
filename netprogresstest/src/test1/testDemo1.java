package test1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class testDemo1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        int find = scan.nextInt();
        Arrays.sort(arr,(o1,o2)->(o2-o1));
        for (int i = 0; i < arr.length; i++) {
            if(find==arr[i])
            {
                System.out.println(i+1);
                break;
            }
        }
    }
}
