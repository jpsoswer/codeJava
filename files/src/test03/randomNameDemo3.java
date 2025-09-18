package test03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class randomNameDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\namesgender.txt"));
        //创建集合来存储名字
        ArrayList<String> namelist= new ArrayList<>();
        String studentxin;
        //第一行数据表示运行了几次
        int count = Integer.parseInt(br.readLine());

        while ((studentxin=br.readLine()) != null)
        {
            String name = studentxin.split("-")[0];
            namelist.add(name);
        }
        //关流
        br.close();
        Random rd = new Random();
        if (count==3)
        {
            System.out.println("张三");
        }
        else{
            int index = rd.nextInt(namelist.size());
            System.out.println(namelist.get(index));
        }
    }
}
