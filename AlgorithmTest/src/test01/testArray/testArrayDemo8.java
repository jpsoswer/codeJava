package test01.testArray;

import java.util.ArrayList;
import java.util.Scanner;

public class testArrayDemo8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int target = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }
        int i=0;
        for (;i<n;i++)
        {
            if(arr.get(i)>=target)
            {
                break;
            }
        }
        arr.add(i,target);

        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
    }
}
