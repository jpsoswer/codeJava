package test01.testNumber;

import java.util.Scanner;

public class testNumberDemo12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
        int number = 0;
        int[] numberArray=new int[10];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = count(l,r,number);
            number++;
        }

        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i]+" ");
        }

    }
    static int count(int l,int r ,int number)
    {
        int count=0;
        for (int i=l;i<=r;i++)
        {
            int t=i;
            while (t!=0)
            {
                int i1 = t % 10;
                if(i1==number)
                {
                    count++;
                }
                t/=10;
            }
        }
        return count;
    }

}
