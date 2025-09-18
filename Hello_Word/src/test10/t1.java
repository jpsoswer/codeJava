package test10;
import java.util.*;
public class t1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        List<Integer> list = new ArrayList<>();
        int cns = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] % 2==0)
            {
                cns++;
            }
            else cns--;

            if (cns == 0) {
                list.add(Math.abs(arr[i+1] - arr[i]));
            }
        }
        Collections.sort(list);
        int count = 0;
        for (int i = 0; i < list.size() && list.get(i) <= m; i++) {
            m-=list.get(i);
            count++;
        }
        System.out.println(count);
    }
}
