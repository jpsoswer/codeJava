package test01.testArray;

import java.util.Scanner;

public class testArrayDemo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[1010];
        int n = scanner.nextInt();
        int number=1;
        for (int i = 0; i < arr.length;) {
            for (int j = 0; j < number; j++) {
                if(i<=arr.length-1)
                    arr[i]=number;
                i++;
            }
            number++;
        }
        System.out.println(arr[n-1]);
    }
}
