package tcpipTest;

import java.io.*;
import java.net.Socket;

public class testDemo3 {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket sk = new Socket("127.0.0.1",10000);

        //创建字节输入流的对象
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("E:\\progresscode_java\\netprogresstest\\client\\baixiaochun.jpg"));
        //创建字节输出流的对象
        BufferedOutputStream bos = new BufferedOutputStream(
                sk.getOutputStream());

        //开始接受输出数据
        int len;
        byte[] bytes = new byte[1024];

        while ((len=bis.read(bytes)) != -1)
        {
            bos.write(bytes,0,len);
        }
        //最关键的一步给传送的位置实时刷新数据
        bos.flush();

        //向服务器提交结束标记
        sk.shutdownOutput();

        //创建对象用来接收服务端发来的反馈
        BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));

        String s = br.readLine();
        System.out.println(s);

        //关流


        br.close();
        sk.close();

    }
}
