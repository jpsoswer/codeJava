package test03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class randomNameDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\namesgender.txt"));
        //创建集合来存储名字
        ArrayList<String> namelist= new ArrayList<>();
        String studentxin;
        while ((studentxin=br.readLine()) != null)
        {
            String name = studentxin.split("-")[0];
            namelist.add(name);
        }
        //关流
        br.close();
        Random rd = new Random();
        int index = rd.nextInt(namelist.size());
        System.out.println(namelist.get(index));
    }
}
