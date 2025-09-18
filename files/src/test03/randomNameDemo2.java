package test03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class randomNameDemo2 {
    public static void main(String[] args) throws IOException {
        //创建字符输入流，获取文件数据
        BufferedReader br = new BufferedReader(new FileReader("src\\namesgender.txt"));
        //创建男生的集合来存储男生
        ArrayList<String> boyname = new ArrayList<>();
        //创建女生集合来存储女生
        ArrayList<String> girlname = new ArrayList<>();
        String studentdemo;
        while ((studentdemo = br.readLine()) != null)
        {
            String gender = studentdemo.split("-")[1];
            if(gender.equals("男"))
            {
                boyname.add(studentdemo);
            }
            else{
                girlname.add(studentdemo);
            }
        }
        //关流
        br.close();
        //创建数据统计
        long boynumber=0;
        long girlnumber=0;

        //创建随机数据对像
        Random rd = new Random();
        //创建循环统计那男女的个数比值
        for (int i=0;i<10000;i++)
        {
            int rdindex = rd.nextInt(10);
            if(rdindex<7)
            {
                boynumber++;

            }
            else {
                girlnumber++;
            }
        }
        System.out.println(boynumber+"   "+girlnumber);
    }
}
