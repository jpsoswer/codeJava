package test8.a01;

import java.util.Scanner;

public class Sqrt {
    //给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
    //由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
    //注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        for(int i=0;i<x;i++)
        {
            if(i*i == x)
            {
                System.out.println(i);
                break;
            }
            else if((i+1)*(i+1) < x && (i+2)*(i+2) > x)
            {
                System.out.println(i+1);
                break;
            }
        }
    }
}
