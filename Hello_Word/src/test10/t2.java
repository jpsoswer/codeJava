package test10;
import java.util.*;
public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int cnt=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]%2==0) cnt++;
            else cnt--;
            if(cnt==0) list.add(Math.abs(arr[i+1]-arr[i]));
        }
        Collections.sort(list);
        int ans=0;
        for (int i = 0; i < list.size() && m>=list.get(i); i++) {
            m-=list.get(i);
            ans++;
        }
        System.out.println(ans);
    }
}
