package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[100000010];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[0];
        brr[max]++;
        for (int i = 1; i < n; i++) {
            if(arr[i]==max)
            {
                brr[max]++;
            }
            else {
                max = arr[i];
                brr[max]++;
            }
        }
        int maxi = Integer.MIN_VALUE;
        int index = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < brr.length; i++) {
            if(brr[i]>maxi)
            {
                maxi = brr[i];
                index = i;
            }
        }
        al.add(index);
        for (int i = 0; i < brr.length; i++) {
            if(i==index)
            {
                continue;
            }
            if(maxi==brr[i])
            {
                al.add(i);
            }
        }
        Collections.sort(al);
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
