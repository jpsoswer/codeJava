package test10;

import java.util.*;
public class mapH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0;i<arr.length;i++)
        {
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();
        }
        Arrays.sort(arr,(o1,o2) ->
                o1[1] == o2[1] ? o1[0]-o2[0] : o1[1]-o2[1]);
        for (int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i][0]);
        }
    }
}
