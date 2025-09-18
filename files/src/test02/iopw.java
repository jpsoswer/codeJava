package test02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class iopw {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\pw.txt"));
        String s = br.readLine();
        //关流
        br.close();
        //用&符来分隔数据
        String[] complie = s.split("&");
        //用=来分隔数据
        String[] regixusername = complie[0].split("=");
        String[] regixpassword = complie[1].split("=");
        //获取正确的数据
        String rightusername = regixusername[1];
        String rightpassword = regixpassword[1];

        //用键盘来输入数据
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scan.next();
        System.out.println("请输入密码：");
        String password = scan.next();
        if(username.equals(rightusername) && password.equals(rightpassword))
        {
            System.out.println("输入数据正确");
        }
        else {
            System.out.println("输入错误，请重新输入");
        }
    }
}
