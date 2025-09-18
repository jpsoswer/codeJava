package test01;
import java.util.Scanner;
import java.util.*;

class shu1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // code here
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);

        input.close();
    }
}