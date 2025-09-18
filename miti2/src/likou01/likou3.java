package likou01;

import java.util.Scanner;

public class likou3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[2];
        String s = n+"";
        int length = s.length();
        if(n<=10)
        {
            arr[0] = 1;
            arr[1] = n-1;
        }
        else {
            int index = 1;
            arr[1] = (int)Math.pow(10,length-1)-1;
            arr[0] = n - arr[1];
            int temp = arr[0];
            while (temp>0)
            {
                if(temp%10==0)
                {
                    arr[1]-=index;
                    arr[0]+=index;
                }
                index*=10;
                temp/=10;
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
