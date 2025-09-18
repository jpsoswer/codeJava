package test10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class twoFen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        Integer[] brr = Arrays.copyOf(arr,arr.length);
        Arrays.sort(brr,(o1,o2)->o2-o1);
        ArrayList<Integer> arrlist = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(brr[i]==arr[j] && !arrlist.contains(j))
                {
                    arrlist.add(j);
                    break;
                }
                else {
                    continue;
                }
            }
        }
        for (int i = 0; i < arrlist.size(); i++) {
            System.out.print((arrlist.get(i)+1)+" ");
        }

    }




}
