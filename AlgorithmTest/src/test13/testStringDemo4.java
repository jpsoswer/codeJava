package test13;

import java.util.Scanner;

public class testStringDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            long count=0;
            String s= scan.next();
            int l = 0,r=0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)=='(')
                {
                    if(r>0)
                    {
                        count+=r;
                        r--;
                    }
                    else {
                        l++;
                    }
                }
                else {
                    if(l>0)
                    {
                        l--;
                    }else {
                        r++;
                    }
                }
            }
            System.out.println(count);
        }



    }
}
