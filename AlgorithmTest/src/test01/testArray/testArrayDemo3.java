package test01.testArray;

import java.util.Scanner;

public class testArrayDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }
        int ji=0;
        int ou = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)
            {
                ou++;
            }
            else {
                ji++;
            }

        }
        System.out.print(ji+" "+ou);
    }
}
