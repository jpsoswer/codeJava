package test;

import java.io.*;

public class shiyongcishu {
    public static void main(String[] args) throws IOException {
        //在文件中读取数据
        BufferedReader br = new BufferedReader(new FileReader("E:\\progresscode_java\\files\\fi.txt"));
        String brs = br.readLine();
        int i = Integer.parseInt(brs);
        int count = i;
        //关流
        br.close();
        //定义计数器对象
        count++;
        //写出数据以便能随时更新
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\progresscode_java\\files\\fi.txt"));
        bw.write(count+"");
        bw.close();
        if(count <=3)
        {
            System.out.println("该软件已经免费试用"+count+"次");
        }
        else {
            System.out.println("该软件的免费使用次数已过如果想继续使用请开启会员");
        }
    }
}
