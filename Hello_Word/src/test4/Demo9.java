package test4;
//输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
//  例如：第一个字符串是"They are students."，第二个字符串是”aeiou"。删除之后的第一个字符串变成"Thy r stdnts."。
//  保证两个字符串的长度均不超过100。
import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        StringBuilder si = new StringBuilder();
        char[] arr = a.toCharArray();
        char[] brr = b.toCharArray();
        if(arr.length < brr.length)
        {
            char[] crr = arr;
            arr = brr;
            brr = crr;
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<brr.length;j++)
            {
                if(arr[i] == brr[j])
                {
                    count++;
                }
            }
            if(count == 0)
            {
                si.append(arr[i]);
            }
            count = 0;
        }

        String s = si.toString();
        System.out.println(s);

    }
}
