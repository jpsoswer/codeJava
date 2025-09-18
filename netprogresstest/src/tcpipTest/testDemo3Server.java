package tcpipTest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class testDemo3Server {
    public static void main(String[] args) throws IOException {
        //创建服务端对象
        ServerSocket ss = new ServerSocket(10000);
        //创建接受数据
        Socket accept = ss.accept();

        //创建字节输入流对象
        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
        //生成随机文件名
        String filename = UUID.randomUUID().toString().replace("-", "");
        //创建字节输出流的对象
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("E:\\progresscode_java\\netprogresstest\\server\\"+filename+".jpg"));

        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1)
        {
            bos.write(bytes,0,len);
        }
        //给传送的位置实时刷新数据
        bos.flush();
        //创建字符输出流对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));

        bw.write("传输成功！");
        bw.newLine();
        //关流

        bw.flush();
        accept.close();
        ss.close();

    }
}
