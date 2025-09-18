package test4;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int z = in.nextInt();
        if(z >2)
        {
            System.out.println("YES");
            System.out.println((1) +" " +(z-1));
        }
        else{
            System.out.println("NO");
        }
    }
}
//小红有一个只包含 '(' 、')' 和 '?' 的字符串，小红想知道有多少种将 '?' 替换成 '(' 或 ')' 的方式使得存在一种循环移位、让该字符串为合法的括号
//串。  假设一个长度为 n*n* 的字符串 s[k:n]+s[1:k)*s*[*k*:*n*]+*s*[1:*k*) 是字符串 s*s* 的循环移位，且 s[k:n]+s[1:k)*s*[*k*:*n*]+*s*[1:*k*)
//是一个合法的括号串，那么字符串 s*s* 符合题目要求。