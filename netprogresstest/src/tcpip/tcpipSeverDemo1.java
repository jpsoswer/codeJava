package tcpip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class tcpipSeverDemo1 {
    public static void main(String[] args) throws IOException {
        //创建服务端对象
        //指定端口与客户端保持一致
        ServerSocket ss = new ServerSocket(10086);

        //用accept方法用以接受数据
        Socket accept = ss.accept();
        //创建字节输入流的对象，用以接受数据
        BufferedReader br =
                new BufferedReader(new InputStreamReader(accept.getInputStream()));
        int b;
        while ((b=br.read()) != -1)
        {
            System.out.print((char) b);
        }

        //关流
        br.close();
        accept.close();
        ss.close();
    }
}
