package mati2;

import java.util.HashMap;
import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = scan.nextInt();
            int k = arr[i];
            if(hm.containsKey(k))
            {
                hm.put(k,hm.get(k)+1);
            }
            else {
                hm.put(k,1);
            }
        }
        for (int i = 0; i < n; i++) {
            Integer h = hm.get(arr[i]);
            System.out.print(h-1+" ");
        }
    }
}
